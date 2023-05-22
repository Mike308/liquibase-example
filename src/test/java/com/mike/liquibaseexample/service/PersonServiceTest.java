package com.mike.liquibaseexample.service;

import com.mike.liquibaseexample.repository.PersonRepository;
import com.mike.liquibaseexample.service.impl.PersonServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class PersonServiceTest {

    @Mock
    private PersonServiceImpl personService;

    @Autowired
    private PersonRepository personRepository;

    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        this.personService = new PersonServiceImpl(personRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    public void shouldReturnAllRecords() {
        assertTrue("Size of collection: " + personService.findAll().size(), personService.findAll().size() > 0);
    }
}
