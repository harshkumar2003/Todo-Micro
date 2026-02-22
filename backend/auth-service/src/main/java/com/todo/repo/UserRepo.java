package com.todo.repo;

import com.todo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User,String>
{
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

}
