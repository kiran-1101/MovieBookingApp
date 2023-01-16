package com.kiran.UserMovieService.repo;

import com.kiran.UserMovieService.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Integer> {

}
