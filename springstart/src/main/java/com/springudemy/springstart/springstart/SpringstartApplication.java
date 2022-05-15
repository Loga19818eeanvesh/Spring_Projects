package com.springudemy.springstart.springstart;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springudemy.springstart.springstart.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringstartApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringstartApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[] {28,3,23,11}, 28);
		System.out.println(result);
		applicationContext.close();
	}

}
