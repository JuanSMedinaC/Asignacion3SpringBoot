package com.example.asignacion3springboot.model;

import java.time.LocalDate;

public class Pelicula {

    private long id;
    private String name;

    private String genre;
    private String director;
    private LocalDate lunchDate;

    public Pelicula(long id, String name, String genre, String director){
        this.name=name;
        this.genre=genre;
        this.director=director;
        lunchDate=LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getLunchDate() {
        return lunchDate;
    }

    public void setLunchDate(LocalDate lunchDate) {
        this.lunchDate = lunchDate;
    }
}
