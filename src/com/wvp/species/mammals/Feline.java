package com.wvp.species.mammals;

import com.wvp.interfaces.animals_interfaces.canSwim;
import com.wvp.interfaces.animals_interfaces.isCarnivore;
import com.wvp.models.Animal;

public class Feline extends Animal implements isCarnivore, canSwim {
    private String name;
    private int age;

    public Feline(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isCarnivore() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
