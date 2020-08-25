package com.wvp.species.mammals;

import com.wvp.models.Animal;

public class OtherMammal extends Animal {
    private final int numberOfLegs;

    public OtherMammal(int id, String species, String nickname, int age, double weight, int speed, String gender, String family, String regionOfOrigin, int numberOfLegs) {
        super(id, species, nickname, age, weight, speed, gender, family, regionOfOrigin);
        this.numberOfLegs = numberOfLegs;
    }

    // implémentation de l'interface "isHorned"
}
