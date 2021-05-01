package com.example.potterapp;

public class Wizard {
    private String name;
    private String gender;
    private String house;
    private String image;
    private String actor;

    public Wizard(String name, String gender, String house, String image, String actor) {
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.image = image;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getHouse() {
        return house;
    }

    public String getImage() {
        return image;
    }

    public String getActor() {
        return actor;
    }
}
