package com.springudemy.springstart.springstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springudemy.springstart.springstart.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringstartApplicationScope {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringstartApplicationScope.class); 

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringstartApplicationScope.class);
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", person1);
		LOGGER.info("{}", person1.getJdbcConnection());
		
		LOGGER.info("{}", person2);
		LOGGER.info("{}", person2.getJdbcConnection());
	}

}
