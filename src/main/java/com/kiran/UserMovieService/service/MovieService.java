package com.kiran.UserMovieService.service;

import com.kiran.UserMovieService.entity.Movie;

import java.util.List;

public interface MovieService {
    public Movie addMovie(Movie movie);
    public List <Movie> getAllMovies();
    public Movie getMovieById(int movieid);
    public void deleteMovieById(int movieid) throws Exception;

}
