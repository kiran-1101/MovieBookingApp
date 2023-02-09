package com.kiran.UserMovieService.service;

import com.kiran.UserMovieService.Response.UserResponse;
import com.kiran.UserMovieService.entity.Movie;
import com.kiran.UserMovieService.entity.User;
import com.kiran.UserMovieService.repo.UserRepo;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public UserResponse getUserById(int userId);
    public User addUser(User user);
    public void deleteUserById(int userId) throws Exception;

}
