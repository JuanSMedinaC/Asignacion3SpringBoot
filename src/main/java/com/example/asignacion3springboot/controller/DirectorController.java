package com.example.asignacion3springboot.controller;

import com.example.asignacion3springboot.model.Director;
import com.example.asignacion3springboot.repository.DirectorRepository;
import com.example.asignacion3springboot.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DirectorController {
    @Autowired
    MovieRepository movieRepo;

    @Autowired
    DirectorRepository directorRepo;

    @GetMapping("directores")
    public ResponseEntity<?> getDirectores(){
        var directores = directorRepo.getDirectores();
        return ResponseEntity.status(200).body(directores);
    }

    @GetMapping("director/{id}")
    public ResponseEntity<?> getDirectorById(@PathVariable long id){
        var director = directorRepo.getDirectorById(id);
        return ResponseEntity.status(200).body(director);
    }

    @PostMapping("director")
    public ResponseEntity<?> registerDirector(@RequestBody Director director){
        directorRepo.addDirector(director);
        return ResponseEntity.status(200).body(director);
    }

    @PutMapping("director/{id}")
    public ResponseEntity<?> editDirector(@PathVariable long id, @RequestBody Director director){
        directorRepo.update(director);
        return ResponseEntity.status(200).body(director);
    }

    @DeleteMapping("director/{id}")
    public ResponseEntity<?> deleteDirector(@PathVariable long id){
        directorRepo.deleteDirector(id);
        return ResponseEntity.status(200).body("Director deleted");
    }


}
