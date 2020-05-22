package com.wvp.species.mammals;

import com.wvp.models.Animal;

public class OtherMammal extends Animal {
    private final int numberOfLegs;

    public OtherMammal(int id, String species, String family, String nickname, int age, int weight, int speed, String gender, int numberOfLegs) {
        super(id, species, nickname, age, weight, speed, gender, family);
        this.numberOfLegs = numberOfLegs;
    }

    // implémentation de l'interface "isHorned"
}
