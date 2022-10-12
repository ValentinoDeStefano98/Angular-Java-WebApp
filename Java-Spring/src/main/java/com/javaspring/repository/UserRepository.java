package com.javaspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaspring.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
