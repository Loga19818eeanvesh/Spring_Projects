package com.springudemy.springstart.springstart;

import org.slf4j.Logger;


import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springudemy.springstart.springstart.basic.BinarySearchImpl;
import com.springudemy.springstart.springstart.cdi.SomeCdiBussiness;

@Configuration
@ComponentScan
public class SpringstartApplicationCdi {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringstartApplicationCdi.class); 

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext applicationContext =new AnnotationConfigApplicationContext(SpringstartApplicationCdi.class);
		
		SomeCdiBussiness business = 
				applicationContext.getBean(SomeCdiBussiness.class);
		
		LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());
	}

}
