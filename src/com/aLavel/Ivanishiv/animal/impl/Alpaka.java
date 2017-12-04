package com.aLavel.Ivanishiv.animal.impl;

import com.aLavel.Ivanishiv.animal.AbstractAnimal;

public class Alpaka extends AbstractAnimal {
    Alpaka(int age, String name) {
        super(age, name);
    }

    public Alpaka() {
    }

    @Override
    public String getAnimalClass() {
        return "Альпака:";
    }

    public String say() {
        return "Piu piu";
    }

    @Override
    public int getMaxAge() {
        return 20;
    }
}
