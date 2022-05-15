package com.springudemy.springstart.springstart.basic;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public BinarySearchImpl() {
		super();
	}
	
	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}


	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers,int numberToSearchFor) {
		//sort the array
		//search array
		//return result
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 0;
	}
	/*
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
	*/
	
}
