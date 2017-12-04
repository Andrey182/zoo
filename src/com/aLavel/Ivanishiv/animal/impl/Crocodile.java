package com.aLavel.Ivanishiv.animal.impl;

import com.aLavel.Ivanishiv.animal.AbstractAnimal;

public class Crocodile extends AbstractAnimal {
    Crocodile(int age, String name) {
        super(age, name);
    }

    @Override
    public String getAnimalClass() {
        return "Крокодильчик:";
    }

    public Crocodile() {
    }

    @Override
    public int getMaxAge() {
        return 20;
    }

    public String say() {
        return "????";
    }
}
