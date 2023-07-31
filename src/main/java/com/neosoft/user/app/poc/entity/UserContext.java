package com.neosoft.user.app.poc.entity;

import lombok.Data;

import javax.persistence.*;



@Data
@Entity
@Table(name= "user_contact_tab")
public class UserContext {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int contextId;


    //@NotNull(message = "Mobile No number can not be null")
    private long mobileNo;

   // @NotNull(message = "Alternate Mobile No number can not be null")
    private long alternateMobileNo;

    //@NotNull(message = "Email  can not be null")
    private String emailId;

   /* @Size(max = 510)
    @NotNull(message = "address can not be null")*/
    private String address;
}
