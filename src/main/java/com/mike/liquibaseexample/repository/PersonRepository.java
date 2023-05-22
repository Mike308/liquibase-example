package com.mike.liquibaseexample.repository;

import com.mike.liquibaseexample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
