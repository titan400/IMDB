package com.Movie.IMDB.rating;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private final List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() //the type movies consists of the objects of the class.
                                    //the objects are name ,id , description
    {
        return movies;

    }


}
