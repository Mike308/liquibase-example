package com.mike.liquibaseexample.controller.impl;

import com.mike.liquibaseexample.controller.PersonController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonControllerImpl implements PersonController {
    @Override
    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Test");
    }
}
