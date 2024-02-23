package com.example.library_zoo_demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.library_zoo_demo.Model.Continent;

@Repository
@RepositoryRestResource(path="continent")
public interface ContinentRepository extends CrudRepository<Continent, Integer> {

}
