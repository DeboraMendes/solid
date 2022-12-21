package com.objectOrientedProgramming.solid.interfaceSegregation.model;

import com.objectOrientedProgramming.solid.interfaceSegregation.MovimentAnimal;
import com.objectOrientedProgramming.solid.interfaceSegregation.SoundAnimal;
import lombok.Getter;

/**
 * Representa um gato
 */
@Getter
public class Cat implements MovimentAnimal, SoundAnimal {

    @Override
    public String move() {
        return "andar";
    }

    @Override
    public String emit() {
        return "miaaauuuu";
    }

}
