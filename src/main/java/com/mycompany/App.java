package com.mycompany;

import com.mycompany.controller.MovieConroller;
import com.mycompany.repository.GoLiveMovieRepository;
import com.mycompany.service.MovieService;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        MovieConroller movieConroller = new MovieConroller();
        MovieService movieService = new MovieService();
        movieConroller.setMovieService(movieService);
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        movieService.setGoLiveMovieRepository(movieRepository);
        movieConroller.add();
    }
}
