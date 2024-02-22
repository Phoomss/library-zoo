package com.example.libraryzoo.repository;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {

}

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.libraryzoo.model.Animal;

@RepositoryRestResource(path = "animal")
public interface AnimalRepository extends CrudRepository<Animal, Integer> {

}
