package com.wvp.species.mammals;

import com.wvp.models.Animal;

public class OtherMammal extends Animal {
    private int numberOfLegs;

    public OtherMammal(int id, String species, String nickname, int age, int weight, int speed, String gender) {
        super(id, species, nickname, age, weight, speed, gender);
    }

    // implémentation de l'interface "isHorned"
}
