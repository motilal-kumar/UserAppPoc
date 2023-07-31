package com.neosoft.user.app.poc.controller;

import com.neosoft.user.app.poc.entity.User;
import com.neosoft.user.app.poc.entity.UserMaster;
import com.neosoft.user.app.poc.repository.UserRepository;
import com.neosoft.user.app.poc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins =  {"http://localhost:4200"})
@RequestMapping("/user/api")
public class UserRestController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserRepository userRepository;




    @PostMapping("/login")
    public ResponseEntity<?>  userLogin(@RequestBody User userLoginData){

        System.out.println("userLoginData: "+userLoginData);

        User user = userRepository.findByUsername(userLoginData.getUsername());

        System.out.println("user: "+user);

        if(user.getPassword().equals(userLoginData.getPassword()))

            return ResponseEntity.ok(user);

        return  (ResponseEntity<?>)  ResponseEntity.internalServerError();


    }

    @PostMapping("save")
    public ResponseEntity<UserMaster> createUser( @RequestBody UserMaster userMaster){




        UserMaster userDetails = new UserMaster();
        userDetails.setFirstName(userMaster.getFirstName());
        userDetails.setLastName(userMaster.getLastName());
        userDetails.setFatherName(userMaster.getFatherName());
        userDetails.setMotherName(userMaster.getMotherName());
        userDetails.setMonthlyIncome(userMaster.getMonthlyIncome());
        userDetails.setDepartment(userMaster.getDepartment());
        userDetails.setDob(userMaster.getDob());

        userDetails.setUserContexts(userMaster.getUserContexts());
        userDetails.setUser(userMaster.getUser());

        UserMaster savedUser = userService.saveUserData(userMaster);
        System.out.println("savedUser:"+savedUser.toString());
        return new ResponseEntity<UserMaster>(savedUser, HttpStatus.CREATED);
    }


  /*  @PostMapping("save")
    public ResponseEntity<UserMaster> createUser( @RequestBody UserMaster userMaster){
        UserMaster savedUser = userService.saveUserData(userMaster);
        System.out.println("savedUser:"+savedUser.toString());
        return new ResponseEntity<UserMaster>(savedUser, HttpStatus.CREATED);
    }
*/

  /*  @PostMapping("/save")
    public UserMaster saveUserData(@RequestBody UserMaster userMaster){
        return userService.saveUserData(userMaster);
    }*/

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
