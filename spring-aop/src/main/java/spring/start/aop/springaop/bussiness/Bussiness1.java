package spring.start.aop.springaop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.start.aop.springaop.data.Dao1;

@Service
public class Bussiness1 {
	@Autowired
	private Dao1 dao1;
	
	public String calculateSomething() {
		return dao1.retriveSomething();
	}
	
}
