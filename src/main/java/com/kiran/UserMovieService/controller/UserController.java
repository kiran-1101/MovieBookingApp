package com.kiran.UserMovieService.controller;

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
    @GetMapping("/{userid}")
    public ResponseEntity<User> getUserByUserId(@PathVariable ("userid") int userid ){
        User user = userServiceImpl.getUserById(userid);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }
    @PostMapping("/addmovie")
    public ResponseEntity<User> adduser(@RequestBody User user){
        User user1 = userServiceImpl.addUser(user);
        return  new ResponseEntity<User>(user1,HttpStatus.OK);
    }



}
