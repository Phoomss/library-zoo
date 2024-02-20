package com.example.libraryzoo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.libraryzoo.model.Animal;

@RepositoryRestResource(path = "animal")
public interface AnimalRepository extends CrudRepository<Animal, Integer> {

}
