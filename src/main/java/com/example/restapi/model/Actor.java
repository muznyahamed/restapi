package com.example.restapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Actor {

    @Id // we define this is an id this is an apring boot annotation
    private String id;  //this cannot be accesed out of the clas
    private String name;
    private String category;
    private String rating;

    public Actor() {
    }

    public String getId() {
        return id;  // this is the ethod to get the id
    }

    public void setId(String id) {
        this.id = id; // get or chnge valur fot the id
    }

    public String getName() {
        return name; // get the name
    }

    public void setName(String name) {
        this.name = name;  // set the name of the model
    }

    public String getCategory() {
        return category; // get the catagory

    }

    public void setCategory(String category) {
        this.category = category; // set the catagory
    }

    public String getRating() {
        return rating;   // set the rating
    }

    public void setRating(String rating) {
        this.rating = rating; // get the rating
    }

}