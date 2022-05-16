package spring.start.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.start.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person,Integer> {

}
