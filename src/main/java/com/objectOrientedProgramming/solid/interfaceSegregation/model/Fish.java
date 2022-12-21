package com.objectOrientedProgramming.solid.interfaceSegregation.model;

import com.objectOrientedProgramming.solid.interfaceSegregation.MovimentAnimal;
import lombok.Getter;

/**
 * Representa um peixe
 */
@Getter
public class Fish implements MovimentAnimal {

    @Override
    public String move() {
        return "nadar";
    }

    //o peixe não emite som, por conta disso, não implementa a interface SoundAnimal

}
