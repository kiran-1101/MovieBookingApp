package com.kiran.UserMovieService.service;

import com.kiran.UserMovieService.Response.UserResponse;
import com.kiran.UserMovieService.entity.Movie;
import com.kiran.UserMovieService.entity.User;
import com.kiran.UserMovieService.exceptions.ResourceNotFoundException;
import com.kiran.UserMovieService.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public UserResponse getUserById(int userId) {
        User user =  userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","userId",userId));
        UserResponse userResponse = new UserResponse();
        userResponse.setUserName(user.getUserName());
        userResponse.setAge(user.getAge());
        userResponse.setStatus(user.getStatus());
        userResponse.setMovietime(user.getMovietime());
        userResponse.setMailId(user.getMailId());
        userResponse.setMovieName(user.getMovieName());
        userResponse.setUserId(user.getUserId());
        return userResponse;
    }

    public UserResponse getUserByUserName(String userName) throws Exception {
        User user = null;
        UserResponse userResponse = new UserResponse();
        try{
             user = userRepo.findByuserName(userName);
            if (user == null)
            {
                throw new ResourceNotFoundException("user","useName",userName);
            }
            else{

                userResponse.setUserName(user.getUserName());
                userResponse.setAge(user.getAge());
                userResponse.setStatus(user.getStatus());
                userResponse.setMovietime(user.getMovietime());
                userResponse.setMailId(user.getMailId());
                userResponse.setMovieName(user.getMovieName());
                userResponse.setUserId(user.getUserId());
                return userResponse;
            }
        }
        catch (ResourceNotFoundException exception){
            throw exception;
        }
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUserById(int userId) throws Exception {
     User deletedUser = null;
     try{
         deletedUser = userRepo.findById(userId).orElse(null);
        if (deletedUser == null)
        {
            throw new Exception("user not available in database ");
        }
        else{
            userRepo.deleteById(userId);
        }
     }
     catch (Exception exception){
         throw exception;
     }


    }
}
