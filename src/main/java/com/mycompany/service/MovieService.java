package com.mycompany.service;

import com.mycompany.entity.Movie;
import com.mycompany.repository.GoLiveMovieRepository;
import com.mycompany.repository.GoLiveMovieRepositoryInterface;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MovieService implements MovieServiceInterface {

    GoLiveMovieRepositoryInterface goLiveMovieRepository = new GoLiveMovieRepository();

    public MovieService() throws IOException {
    }


    public void registerMovie() {
       goLiveMovieRepository.add();
    }
}
