package com.example.libraryzoo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.libraryzoo.model.Type;

@RepositoryRestResource(path = "type")
public interface TypeRepository extends CrudRepository<Type, Integer> {

}
