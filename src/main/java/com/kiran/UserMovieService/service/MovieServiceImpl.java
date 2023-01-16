package com.kiran.UserMovieService.service;

import com.kiran.UserMovieService.entity.Movie;
import com.kiran.UserMovieService.entity.User;
import com.kiran.UserMovieService.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepo movieRepo;
    @Override
    public Movie addMovie(Movie movie) {
        return movieRepo.save(movie);
    }
    @Override
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    @Override
    public Movie getMovieById(int movieid) {
        return movieRepo.findById(movieid).get();
    }

    @Override
    public void deleteMovieById(int movieid) throws Exception {
        Movie deletedUser = null;
        try{
            deletedUser = movieRepo.findById(movieid).orElse(null);
            if (deletedUser == null)
            {
                throw new Exception("user not available ");
            }
            else{
                movieRepo.deleteById(movieid);
            }
        }
        catch (Exception exception){
            throw exception;
        }
    }
}
