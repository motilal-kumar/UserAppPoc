package com.neosoft.user.app.poc.controller;

import com.neosoft.user.app.poc.entity.UserMaster;
import com.neosoft.user.app.poc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/api")
public class UserRestController {

    @Autowired
    private IUserService userService;


    @PostMapping("/save")
    public UserMaster saveUserData(@RequestBody UserMaster userMaster){
        return userService.saveUserData(userMaster);
    }

    @GetMapping("/users")
    public List<UserMaster> getAllUserData(){
        return userService.findAllUserData();
    }


    @GetMapping("/get/{userMasterId}")
    public UserMaster fetchUserById(@PathVariable("userMasterId") int userMasterId){

        return userService.findUserById(userMasterId);
    }

    @GetMapping("/fetch/{department}")
    public UserMaster fetchUser(@PathVariable("department") String department){

        return userService.findUserByDepartment(department);
    }


    @GetMapping("/search")
    public ResponseEntity<List<UserMaster>> searchUserMasterData(@RequestParam("query") String query){
        return ResponseEntity.ok(userService.searchUserMaster(query));
    }


}
