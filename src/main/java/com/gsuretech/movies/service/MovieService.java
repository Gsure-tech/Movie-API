package com.gsuretech.movies.service;

import com.gsuretech.movies.entity.Movie;
import com.gsuretech.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
     return movieRepository.findAll();
    }
}
