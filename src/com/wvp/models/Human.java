package com.wvp.models;

public abstract class Human {
    // Attributes
    private String name;
    private int age;

    public Human(String name, int age) {
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

    public abstract String getVisitedRegions();


    // private String role;
    // private Enum gender;
    // nationality (enum)
}
