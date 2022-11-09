package com.mycompany.entity;

public class Movie implements MovieInterface {

    private String titleAndGenre;


    public String getTitleAndGenre() {
        return titleAndGenre;
    }


    public void setTitleAndGenre(String titleAndGenre) {
        this.titleAndGenre = titleAndGenre;
    }
}
