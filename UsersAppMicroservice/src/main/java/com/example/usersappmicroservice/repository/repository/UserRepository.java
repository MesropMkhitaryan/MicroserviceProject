package com.example.usersappmicroservice.repository.repository;

import com.example.usersappmicroservice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
