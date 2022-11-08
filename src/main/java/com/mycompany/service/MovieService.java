package com.mycompany.service;

import com.mycompany.entity.Movie;
import com.mycompany.repository.MovieRepository;

public class MovieService {

    MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie){
       movieRepository.add(movie);
       System.out.printf("The movie with title and genre %s has been added", movie.getTitleAndGenre());
    }
}
