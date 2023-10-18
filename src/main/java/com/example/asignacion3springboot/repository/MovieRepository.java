package com.example.asignacion3springboot.repository;

import com.example.asignacion3springboot.model.Director;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.asignacion3springboot.model.Pelicula;
import com.example.asignacion3springboot.repository.DirectorRepository;
import com.example.asignacion3springboot.model.Director;

@Repository
public class MovieRepository {
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public Pelicula saveMovie(Pelicula movie){
        long id=peliculas.size();
        movie.setId(id);
        peliculas.add(movie);
        return movie;
    }

    public Pelicula getMovieById(long id){
        return peliculas.get(Integer.parseInt(String.valueOf(id)));
    }

    public void updateMovie(long id, Pelicula movie){
        peliculas.set(Integer.parseInt(String.valueOf(id)), movie);
    }

    public void deleteMovie(long id){
        int movieId=Integer.parseInt(String.valueOf(id));
        peliculas.remove(movieId);
        for (int i=movieId; i<peliculas.size(); i++){
            peliculas.get(i).setId(peliculas.get(i).getId()-1);
        }
    }

    /*
    para usar este metodo tienes primero que sacar el director desde el controller a partir del id,
    y luego pasarlo a este metodo por parametro
     */
    public ArrayList<Pelicula> listMoviesByDirector(Director director){
        ArrayList<Pelicula> result=new ArrayList<>();

        for(Pelicula movie : peliculas){
            if(movie.getDirector().equalsIgnoreCase(director.getName())){
                result.add(movie);
            }
        }
        return result;
    }


    public ArrayList<Pelicula> getMovies(){
        return peliculas;
    }
}
