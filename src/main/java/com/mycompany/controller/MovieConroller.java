package com.mycompany.controller;

import com.mycompany.entity.Movie;
import com.mycompany.service.MovieService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MovieConroller {
    MovieService movieService = new MovieService();

    public MovieConroller() throws IOException {
    }

    public void add() {
        movieService.registerMovie ();
    }
}
