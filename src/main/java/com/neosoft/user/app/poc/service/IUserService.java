package com.neosoft.user.app.poc.service;

import com.neosoft.user.app.poc.entity.UserMaster;

import java.util.List;

public interface IUserService {


    public UserMaster saveUserData(UserMaster user);

    public List<UserMaster> findAllUserData();

    public UserMaster findUserById(int userMasterId);

    public List<UserMaster> searchUserMaster(String query);

    public UserMaster findUserByDepartment(String department);
}
