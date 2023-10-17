package com.example.asignacion3springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DirectorController {

    @GetMapping("directores")
    public ResponseEntity<?> getDirectores(){
        return ResponseEntity.status(200).body("directores");
    }

    @GetMapping("director/{id}")
    public ResponseEntity<?> getDirectorById(@PathVariable String id){
        return ResponseEntity.status(200).body("Director");
    }

    @PostMapping("director")
    public ResponseEntity<?> registerDirector(@PathVariable String id){
        return ResponseEntity.status(200).body("director");
    }

    @PutMapping("director/{id}")
    public ResponseEntity<?> editDirector(@PathVariable String id){
        return ResponseEntity.status(200).body("Director");
    }

    @DeleteMapping("director/{id}")
    public ResponseEntity<?> deleteDirector(@PathVariable String id){
        return ResponseEntity.status(200).body("Director");
    }


}
