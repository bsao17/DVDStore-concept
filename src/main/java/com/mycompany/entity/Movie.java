package com.mycompany.entity;

public class Movie implements MovieInterface {

    private String titleAndGenre;

    @Override
    public String getTitleAndGenre() {
        return titleAndGenre;
    }

    @Override
    public void setTitleAndGenre(String titleAndGenre) {
        this.titleAndGenre = titleAndGenre;
    }
}
