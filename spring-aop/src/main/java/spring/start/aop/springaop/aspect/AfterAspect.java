package spring.start.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@After(value="spring.start.aop.springaop.aspect.CommonPoinCut.bussinessLayerAspect()")
	public void after(JoinPoint joinPoint){
		logger.info(" Aop after call - {}",joinPoint);
	}
	
	@AfterReturning(value="execution(* spring.start.aop.springaop.bussiness.*.*(..))",returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result){
		logger.info(" Aop afterReturning call - {} - return with value {}",joinPoint, result);
	}
	
	@AfterThrowing(value="execution(* spring.start.aop.springaop.bussiness.*.*(..))",throwing="exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception){
		logger.info(" Aop afterThrowing call - {} - thrown the exception {}",joinPoint, exception);
	}
}
