package com.example.studentmgnt.entities;


import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String username;
    private String password;
}
