package com.pocdb.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pocdb.entity.Task;
@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Serializable>{

}
