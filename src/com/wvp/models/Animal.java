package com.wvp.models;

public abstract class Animal {
    // Attributes
    private int id;
    private String species;
    private String family;
    private String nickname;
    private int age;
    private double weight;
    private int speed;
    private String gender;
    private String regionOfOrigin;

    // Constructor
    public Animal(int id, String species, String nickname, int age, double weight, int speed, String gender, String family, String regionOfOrigin) {
        this.id = id;
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
        this.speed = speed;
        this.gender = gender;
        this.family = family;
        this.regionOfOrigin = regionOfOrigin;
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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
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

    public String getRegionOfOrigin() {
        return regionOfOrigin;
    }

    public void setRegionOfOrigin(String regionOfOrigin) {
        this.regionOfOrigin = regionOfOrigin;
    }

    public void isImmobile() {
        System.out.println(getNickname() + ", the " + getSpecies()
                + ", " + getAge() + " years old, " + " is sit down");
    }

    public void animalSound() {
    }

    @Override
    public String toString() {
        return family.toUpperCase() + " {" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", family='" + family + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", speed=" + speed +
                ", gender='" + gender + '\'' +
                ", regionOfOrigin='" + regionOfOrigin + '\'' +
                '}';
    }
}
