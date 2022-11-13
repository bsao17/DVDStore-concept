package com.mycompany.service;

import com.mycompany.repository.GoLiveMovieRepositoryInterface;

public class MovieService implements MovieServiceInterface {

    GoLiveMovieRepositoryInterface goLiveMovieRepository;

    public void registerMovie() {
       goLiveMovieRepository.add();
    }

    public GoLiveMovieRepositoryInterface getGoLiveMovieRepository() {
        return goLiveMovieRepository;
    }

    public void setGoLiveMovieRepository(GoLiveMovieRepositoryInterface goLiveMovieRepository) {
        this.goLiveMovieRepository = goLiveMovieRepository;
    }
}
