package com.Movie.IMDB.rating.repo;

import com.Movie.IMDB.rating.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//This interface will work with the databases.
public interface MovieRepo extends CrudRepository<Movie,Integer>
        //the type movies consists of the objects of the class.
        //the objects are name ,id , description
{
    public List<Movie> findAll();
    public Movie findById(int id);
}
