package com.scispike.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.scispike.model.ToDo;

@RepositoryRestResource(collectionResourceRel="todos", path="todos")
public interface ToDoRepository extends MongoRepository<ToDo, String>{

	List<ToDo> findByTitle(@Param("title") String title);
}