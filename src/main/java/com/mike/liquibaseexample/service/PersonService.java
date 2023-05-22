package com.mike.liquibaseexample.service;

import com.mike.liquibaseexample.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

}
