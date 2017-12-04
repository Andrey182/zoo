package com.aLavel.Ivanishiv.animal.impl;

import com.aLavel.Ivanishiv.animal.AbstractAnimal;

public class Lion extends AbstractAnimal {

    public Lion(int age, String name) {
        super(age, name);
    }

    public Lion() {
    }

    @Override
    public String getAnimalClass() {
        return "Лёва:";
    }

    @Override
    public int getMaxAge() {
        return 20;
    }

    public String say() {
        return "RRRRRrrrr";
    }

    @Override
    public String toString() {
        return "Lion{}"+ getAnimalClass()+say()+getName()+getAge();
    }
}
