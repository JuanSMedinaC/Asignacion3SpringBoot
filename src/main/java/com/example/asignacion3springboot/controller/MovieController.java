package com.example.asignacion3springboot.controller;

import com.example.asignacion3springboot.repository.DirectorRepository;
import com.example.asignacion3springboot.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.asignacion3springboot.model.*;


@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepo;

    @Autowired
    DirectorRepository directorRepo;

    @GetMapping("/peliculas")
    public ResponseEntity<?> getPeliculas(){
        var peliculas = movieRepo.getMovies();
        return ResponseEntity.status(200).body(peliculas);
    }

    @GetMapping("/pelicula/{id}")
    public ResponseEntity<?> getPeliculaById(@PathVariable long id){
        var pelicula = movieRepo.getMovieById(id);
        return ResponseEntity.status(200).body(pelicula);
    }

    @PostMapping("pelicula")
    public ResponseEntity<?> createPelicula(@RequestBody Pelicula pelicula){
        movieRepo.saveMovie(pelicula);
        return ResponseEntity.status(200).body(pelicula);
    }

    @PutMapping("pelicula/{id}")
    public ResponseEntity<?> editPelicula(@PathVariable long id, @RequestBody Pelicula pelicula){
        movieRepo.updateMovie(id,pelicula);
        return ResponseEntity.status(200).body(pelicula);
    }

    @DeleteMapping("pelicula/{id}")
    public ResponseEntity<?> deletePelicula(@PathVariable long id){
        movieRepo.deleteMovie(id);
        return ResponseEntity.status(200).body("removed succesfully");
    }

    @GetMapping("directores/{id}/peliculas")
    public ResponseEntity<?> getPeliculasByDirectorID(@PathVariable long id){
        var director = directorRepo.getDirectorById(id);
        var peliculas = movieRepo.listMoviesByDirector(director);
        return ResponseEntity.status(200).body(peliculas);
    }
}
