package com.mycompany.repository;

import com.mycompany.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    public List<Movie> movies = new ArrayList<Movie>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println(movies.size());
    }
}
