package com.aLavel.Ivanishiv;

import com.aLavel.Ivanishiv.animal.*;
import com.aLavel.Ivanishiv.animal.impl.Alpaka;
import com.aLavel.Ivanishiv.animal.impl.Crocodile;
import com.aLavel.Ivanishiv.animal.impl.Elephant;
import com.aLavel.Ivanishiv.animal.impl.Lion;

import java.util.Scanner;

public class AnimalResolver {

    public static AbstractAnimal resolveAnimal(int i) {
        switch (i) {
            case 1:
                return new Alpaka();
            case 2:
                return new Crocodile();
            case 3:
                return new Elephant();
            case 4:
                return new Lion();
        }
        return null;
    }
}
