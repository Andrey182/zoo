package com.aLavel.Ivanishiv.animal.impl;

import com.aLavel.Ivanishiv.animal.AbstractAnimal;

public class Elephant extends AbstractAnimal {

    Elephant(int age, String name) {
        super(age, name);
    }


    public Elephant() {
    }

    @Override
    public String getAnimalClass() {
        return "Слооон!!!:";
    }

    @Override
    public int getMaxAge() {
        return 20;
    }

    public String say() {
        return " Ya Slon";
    }

}
