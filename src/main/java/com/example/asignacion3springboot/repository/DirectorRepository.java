package com.example.asignacion3springboot.repository;

import org.springframework.stereotype.Repository;
import com.example.asignacion3springboot.model.Director;
import java.util.*;
@Repository
public class DirectorRepository {
    private ArrayList<Director> directores = new ArrayList<>();

    public ArrayList<Director> getDirectores(){
        return directores;
    }

    public Director getDirectorById(long id){
        for(Director dir : directores){
            if(dir.getId()==id){
                return dir;
            }
        }
        return null;
    }

    public void addDirector(Director director){
        directores.add(director);
    }

    public void update(Director newDirector){
        for(int i=0; i<directores.size(); i++){
            if(directores.get(i).getId()== newDirector.getId()){
                directores.set(i, newDirector);
                break;
            }
        }
    }

    public void deleteDirector(long id){
        for(int i=0; i<directores.size(); i++){
            if(directores.get(i).getId()==id){
                directores.remove(i);
                break;
            }
        }
    }
}
