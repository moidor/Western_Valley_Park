package com.wvp.people;

import com.wvp.models.Human;

public abstract class Scientist extends Human {
    public Scientist(String name, int age) {
        super(name, age);
    }

    // Method(s)
    public abstract void treatAnimal();
}
