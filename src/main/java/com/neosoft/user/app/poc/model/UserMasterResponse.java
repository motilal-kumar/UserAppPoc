package com.neosoft.user.app.poc.model;


import com.neosoft.user.app.poc.entity.User;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class UserMasterResponse {

    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private Integer monthlyIncome;
    private String department;
    private Date dob;

    private List<UserContextsResponse> userContexts;
    private User user;


}
