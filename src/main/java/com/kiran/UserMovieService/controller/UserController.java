package com.kiran.UserMovieService.controller;

import com.kiran.UserMovieService.Response.UserResponse;
import com.kiran.UserMovieService.entity.User;
import com.kiran.UserMovieService.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;
    @GetMapping("/HelloWorld")
    public String helloWorld()
    {
        return "hello world";
    }
    @GetMapping("/allusers")
    public ResponseEntity<List<User>>getAllUsers(){
        List<User> user = userServiceImpl.getAllUsers();
        return new ResponseEntity<List<User>>(user, HttpStatus.OK);
    }
    @GetMapping("/id/{userid}")
    public ResponseEntity<UserResponse> getUserByUserId(@PathVariable ("userid") int userid ){
        UserResponse user = userServiceImpl.getUserById(userid);
        return new ResponseEntity<UserResponse>(user,HttpStatus.OK);
    }

    @GetMapping("/name/{userName}")
    public ResponseEntity<UserResponse> getUserByUserName(@PathVariable ("userName") String userName ) throws Exception {
        UserResponse user = userServiceImpl.getUserByUserName(userName);
        return new ResponseEntity<UserResponse>(user,HttpStatus.OK);
    }

    @PostMapping("/addmovie")
    public ResponseEntity<User> adduser(@RequestBody User user){
        User user1 = userServiceImpl.addUser(user);
        return  new ResponseEntity<User>(user1,HttpStatus.OK);
    }



}
