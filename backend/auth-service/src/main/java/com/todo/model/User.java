package com.todo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
@Data
public class User
{
    @Id
    private String id;

    private String username;

    private String email;

    private String password;

    private String role;

    private LocalDateTime createdAt;

}
