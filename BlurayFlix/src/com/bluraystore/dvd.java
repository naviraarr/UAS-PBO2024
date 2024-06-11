package com.bluraystore;

public class dvd {
    public String dvdName;
    public String genre;
    public String director;
    public int price;

    public dvd(String dvdName, String genre, String director, int price) {
        this.dvdName = dvdName;
        this.genre = genre;
        this.director = director;
        this.price = price;
    }

    public String getNewName() {
        return dvdName;
    }

    public void setNewName(String dvdName) {
        this.dvdName = dvdName;
    }

    protected String getNewGenre() {
        return genre;
    }

    protected void setNewGenre(String genre) {
        this.genre = genre;
    }

    public int getNewPrice() {
        return price;
    }

    public void setNewPrice(int price) {
        this.price = price;
    }
}