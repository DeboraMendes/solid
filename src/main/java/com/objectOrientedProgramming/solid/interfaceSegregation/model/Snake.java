package com.objectOrientedProgramming.solid.interfaceSegregation.model;

import com.objectOrientedProgramming.solid.interfaceSegregation.MovimentAnimal;
import com.objectOrientedProgramming.solid.interfaceSegregation.SoundAnimal;
import lombok.Getter;

/**
 * Representa uma cobra
 */
@Getter
public class Snake implements MovimentAnimal, SoundAnimal {

    @Override
    public String move() {
        return "rastejar";
    }

    @Override
    public String emit() {
        return "ssssss";
    }

}
