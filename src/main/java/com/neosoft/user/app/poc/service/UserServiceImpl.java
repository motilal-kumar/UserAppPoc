package com.neosoft.user.app.poc.service;

import com.neosoft.user.app.poc.entity.UserMaster;
import com.neosoft.user.app.poc.repository.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{


    @Autowired
    private UserMasterRepository userMasterRepository;

    @Override
    public UserMaster saveUserData(UserMaster userMaster) {

        userMaster.setFirstName(userMaster.getFirstName());


        return userMasterRepository.save(userMaster);
    }

    @Override
    public List<UserMaster> findAllUserData() {
        return userMasterRepository.findAll();
    }


    public UserMaster findUserById(int userMasterId) {
        return userMasterRepository.findById(userMasterId).orElse(null);
    }

    @Override
    public List<UserMaster> searchUserMaster(String query) {
        List<UserMaster> userMasters = userMasterRepository.searchUserMaster(query);
        return userMasters;
    }

    @Override
    public UserMaster findUserByDepartment(String department) {
        return userMasterRepository.findUserByDepartment(department);
    }
}
