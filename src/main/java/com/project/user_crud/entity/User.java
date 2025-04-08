package com.project.user_crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private String id;

    private String name;

    private String emailAddress;

    public User(){
        this.id= UUID.randomUUID().toString();
    }
}
