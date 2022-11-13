package com.mycompany.controller;
import com.mycompany.service.MovieServiceInterface;

import java.io.FileNotFoundException;

public class MovieConroller implements MovieControllerInterface{
    private MovieServiceInterface movieService;

    public void add() throws FileNotFoundException {
        movieService.registerMovie();
    }

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

}
