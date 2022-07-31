package com.example.restapi.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.restapi.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> { // thi states it inherits the properties by mongo repository

    Movie findMovieById(String movieId);

}