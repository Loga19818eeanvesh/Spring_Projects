package spring.start.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.start.database.databasedemo.entity.Person;
import spring.start.database.databasedemo.jdbc.PersonJdbcDao;
import spring.start.database.databasedemo.jpa.PersonJpaRepository;
import spring.start.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class DatabaseDemoJpaApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//JPA
		logger.info("Inserting -> {}", 
				repository.save(new Person("Tara1", "Berlin1", new Date())));
		
		logger.info("Inserting -> {}", 
				repository.save(new Person("Tara2", "Berlin2", new Date())));
		
		logger.info("User id 10001 -> {}", repository.findById(1));
		
		logger.info("Inserting -> {}", 
				repository.save(new Person("Tara3", "Berlin3", new Date())));
		
		logger.info("Inserting -> {}", 
				repository.save(new Person("Tara4", "Berlin4", new Date())));
		
		logger.info("Update 3 -> {}", 
				repository.save(new Person(3, "Pieter", "Utrecht", new Date())));
		
		repository.deleteById(2);

		logger.info("All users -> {}", repository.findAll());
	}

}
