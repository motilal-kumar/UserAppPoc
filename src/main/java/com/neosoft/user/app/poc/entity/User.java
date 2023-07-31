package com.neosoft.user.app.poc.entity;

import lombok.Data;


import javax.persistence.*;

@Entity
@Data
@Table(name= "user_tab")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "user_id")
    private Integer userId;
    private String username;
    private String password;
}
