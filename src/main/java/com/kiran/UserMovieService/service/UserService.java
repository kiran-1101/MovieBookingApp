package com.kiran.UserMovieService.service;

import com.kiran.UserMovieService.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public User getUserById(int userId);
    public User getUserByUserName(String userName);
    public User addUser(User user);
    public void deleteUserById(int userId) throws Exception;

}
