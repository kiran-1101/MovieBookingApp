package com.kiran.UserMovieService.controller;

import com.kiran.UserMovieService.entity.Movie;
import com.kiran.UserMovieService.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @GetMapping("/helloworld")
    public String Hello(){
        return "hello world from movie controller";
    }
    @Autowired
    private MovieServiceImpl movieServiceImpl;

    @GetMapping("/allmovies")
    public ResponseEntity <List<Movie>> getAllMovies(){
        List <Movie> movies = movieServiceImpl.getAllMovies();
        return new ResponseEntity<List<Movie>>(movies,HttpStatus.OK);
    }
    @GetMapping("/{movieid}")
    public ResponseEntity<Movie> getMovieById(@PathVariable ("movieid") int movieid){
        Movie movie = movieServiceImpl.getMovieById(movieid);
        return new ResponseEntity<Movie>(movie,HttpStatus.OK);
    }
    @PostMapping("/addmmovie")
    public ResponseEntity<Movie> addmovie(@RequestBody Movie movie){
        Movie movie1 = movieServiceImpl.addMovie(movie);
        return  new ResponseEntity<Movie>(movie1,HttpStatus.OK);
    }


}
