package com.mycompany.controller;

import com.mycompany.entity.Movie;
import com.mycompany.service.MovieService;

import java.util.Scanner;

public class MovieConroller {
    MovieService movieService = new MovieService();

    public void addUsingConsole(){
        System.out.println("Veuillez entrer le titre d'un film et son genre au format \"titre: genre\".  !");
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
        movie.setTitleAndGenre(scanner.nextLine());
        movieService.registerMovie(movie);
    }
}
