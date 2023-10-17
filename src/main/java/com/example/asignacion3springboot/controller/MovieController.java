package com.example.asignacion3springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    @GetMapping("peliculas")
    public ResponseEntity<?> getPeliculas(){
        return ResponseEntity.status(200).body("peliculas");
    }

    @GetMapping("pelicula/{id}")
    public ResponseEntity<?> getPeliculaById(@PathVariable String id){
        return ResponseEntity.status(200).body("pelicula");
    }

    @PostMapping("pelicula")
    public ResponseEntity<?> createPelicula(@RequestBody Pelicula pelicula){
        return ResponseEntity.status(200).body("pelicula");
    }

    @PutMapping("pelicula/{id}")
    public ResponseEntity<?> editPelicula(@PathVariable String id){
        return ResponseEntity.status(200).body("pelicula");
    }

    @DeleteMapping("pelicula/{id}")
    public ResponseEntity<?> deletePelicula(@PathVariable String id){
        return ResponseEntity.status(200).body("pelicula");
    }

    @GetMapping("directores/{id}/peliculas")
    public ResponseEntity<?> getPeliculasByDirectorID(@PathVariable String id){
        return ResponseEntity.status(200).body("peliculas");
    }
}
