package com.wvp.species.egg_laying;

import com.wvp.models.Animal;

public class Reptile extends Animal {
    public Reptile(int id, String species, String nickname, int age, double weight, int speed, String gender, String family, String regionOfOrigin) {
        super(id, species, nickname, age, weight, speed, gender, family, regionOfOrigin);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getSpecies() {
        return super.getSpecies();
    }

    @Override
    public void setSpecies(String species) {
        super.setSpecies(species);
    }

    @Override
    public String getFamily() {
        return super.getFamily();
    }

    @Override
    public void setFamily(String family) {
        super.setFamily(family);
    }

    @Override
    public String getNickname() {
        return super.getNickname();
    }

    @Override
    public void setNickname(String nickname) {
        super.setNickname(nickname);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getRegionOfOrigin() {
        return super.getRegionOfOrigin();
    }

    @Override
    public void setRegionOfOrigin(String regionOfOrigin) {
        super.setRegionOfOrigin(regionOfOrigin);
    }

    @Override
    public void isImmobile() {
        super.isImmobile();
    }
}
