package com.mike.liquibaseexample.service.impl;

import com.mike.liquibaseexample.model.Person;
import com.mike.liquibaseexample.repository.PersonRepository;
import com.mike.liquibaseexample.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
