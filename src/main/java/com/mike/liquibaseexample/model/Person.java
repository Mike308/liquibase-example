package com.mike.liquibaseexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {

    @Id
    private long id;
    @Column(name = "first_name")
    private String firstname;
    private String surname;
    @Column(name = "birthdate")
    private LocalDate birthDate;
}
