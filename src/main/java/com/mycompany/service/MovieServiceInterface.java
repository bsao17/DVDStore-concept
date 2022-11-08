package com.mycompany.service;

import com.mycompany.entity.Movie;

import java.io.FileNotFoundException;

public interface MovieServiceInterface {
    void registerMovie() throws FileNotFoundException;
}
