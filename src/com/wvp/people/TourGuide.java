package com.wvp.people;

import com.wvp.models.Human;

public abstract class TourGuide extends Human {
    private short id;

    public TourGuide(String name, int age) {
        super(name, age);
    }
}
