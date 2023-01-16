package com.kiran.UserMovieService.service;

import com.kiran.UserMovieService.entity.User;
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
    public User getUserById(int userId) {
        return userRepo.findById(userId).orElse(null);
    }

    @Override
    public User getUserByUserName(String userName) {
        return null;
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
            throw new Exception("user not available ");
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
