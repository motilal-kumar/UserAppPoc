package com.neosoft.user.app.poc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "user_contact_tab")
public class UserContext {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int contextId;
    private long mobileNo;
    private long alternateMobileNo;
    private String emailId;
    private String address;
}
