package com.example.libraryzoo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.libraryzoo.model.Continent;

@RepositoryRestResource(path = "continent")
public interface ContinentRepository extends CrudRepository<Continent, Integer> {

}
