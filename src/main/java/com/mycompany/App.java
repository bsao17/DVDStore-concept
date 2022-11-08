package com.mycompany;

import com.mycompany.controller.MovieConroller;
import com.mycompany.repository.GoLiveMovieRepository;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
        goLiveMovieRepository.add();
    }
}
