package com.springudemy.springstart.springstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springudemy.springstart.componant.ComponantDao;
import com.springudemy.springstart.springstart.scope.PersonDAO;

@Configuration
@ComponentScan("com.springudemy.springstart.componant")
public class SpringstartApplicationComponent {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringstartApplicationComponent.class); 

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringstartApplicationComponent.class);
		ComponantDao person1 = applicationContext.getBean(ComponantDao.class);
		ComponantDao person2 = applicationContext.getBean(ComponantDao.class);
		
		LOGGER.info("{}", person1);
		LOGGER.info("{}", person1.getComponantJdbcconnection());
		
		LOGGER.info("{}", person2);
		LOGGER.info("{}", person2.getComponantJdbcconnection());
	}

}
