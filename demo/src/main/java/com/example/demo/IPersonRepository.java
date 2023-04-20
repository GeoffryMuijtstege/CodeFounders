package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Long> {

}
