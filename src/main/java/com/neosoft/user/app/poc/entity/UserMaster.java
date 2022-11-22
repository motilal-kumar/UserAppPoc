package com.neosoft.user.app.poc.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "user_master_tab")
public class UserMaster {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_master_id")
    private int userMasterId;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private Integer monthlyIncome;

    private String department;
    private Date dob;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private List<UserContext> userContexts;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name ="user_id")
    private User user;
}
