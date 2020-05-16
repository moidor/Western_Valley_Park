package com.wvp.models;

public abstract class Animal {
    // Attributes
    private int id;
    private String species;
    private String nickname;
    private int age;
    private int weight;
    private int speed;
    private String gender;

    // Constructor
    public Animal(int id, String species, String nickname, int age, int weight, int speed, String gender) {
        this.id = id;
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
        this.speed = speed;
        this.gender = gender;
    }

    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void isImmobile() {
        System.out.println(getNickname() + ", the " + getSpecies()
                + ", " + getAge() + " years old, " + " is immobile");
    }
}
