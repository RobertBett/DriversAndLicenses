package com.example.licence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.licence.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long>{

}