package com.example.restapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.Actor;
import com.example.restapi.repository.ActorRepository;

@RestController
public class ActorController {

    private Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping(value = "/abc")
    public List<Actor> getAllMovies() {
        logger.info("Getting all movies.");
        return actorRepository.findAll();
    }

    @GetMapping(value = "/dai/{movieId}")
    public Actor getActorById(@PathVariable String movieId) {
        logger.info("Getting movie with ID: {}", movieId);
        return actorRepository.findActorById(movieId);
    }

    @PostMapping(value = "/createActor")
    public Actor addMovie(@RequestBody Actor movie) {
        logger.info("Saving movie.");
        return actorRepository.save(movie);
    }

    @PutMapping(value = "/updateActor/{movieId}")
    public Actor updateMovie(@PathVariable String movieId, @RequestBody Actor movie) {
        logger.info("Updating movie with ID: {}", movieId);
        movie.setId(movieId);
        return actorRepository.save(movie);
    }

    @DeleteMapping(value = "/deleteActor/{movieId}")
    public void deleteMovie(@PathVariable String movieId) {
        logger.info("Deleting movie with ID: {}", movieId);
        actorRepository.deleteById(movieId);
    }
}


