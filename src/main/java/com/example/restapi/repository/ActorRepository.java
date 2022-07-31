package com.example.restapi.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.restapi.model.Actor;

public interface ActorRepository extends MongoRepository<Actor, String> { // thi states it inherits the properties by mongo repository
    Actor findActorById(String actorId);

}