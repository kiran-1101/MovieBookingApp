package com.kiran.UserMovieService.repo;

import com.kiran.UserMovieService.entity.Movie;
import com.kiran.UserMovieService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

       public User findByuserName (String userName) throws  Exception;

}
