package com.aLavel.Ivanishiv;

import com.aLavel.Ivanishiv.animal.AbstractAnimal;

import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    private AbstractAnimal[] animals;
    Scanner scanner = new Scanner(System.in);

    public Zoo() {
        animals = new AbstractAnimal[2];
    }

    public void addAnimal(AbstractAnimal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                break;
            }
        }
    }

    public void addAnimalName(AbstractAnimal animal) {
        System.out.println(MenuType.ADD_ANIMAL_NAME.getMenuLine());
        String addName = scanner.nextLine();
        animal.setName(addName);

    }

    public void addAnimalAge(AbstractAnimal animal) {
        System.out.println(MenuType.ADD_ANIMAL_AGE.getMenuLine());
        while (true) {
            int addAge = scanner.nextInt();
            scanner.nextLine();
            if (addAge > animal.getMaxAge()) {
                System.out.println("Зверь так долго не живвет. Попробуй еще разок");
            } else {
                animal.setAge(addAge);
                break;
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null)
                return false;
        }
        return true;
    }

    public void extendZooSize() {
        AbstractAnimal[] new_animals;
        new_animals = new AbstractAnimal[animals.length + 1];
        for (int i = 0; i < animals.length; i++) {
            new_animals[i] = animals[i];
        }
        animals = new_animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }

    public void showAnimal() {
        System.out.println("Можете просмотреть животноеживотное из зоопарка");
        while (true) {
            System.out.println(MenuType.SHOW_ANIMAL.getMenuLine());
            int chooseShowAnimal = scanner.nextInt();
            if (chooseShowAnimal == 1) {
                System.out.println("выберете животного из зоопарка");
                int showAnimal = scanner.nextInt();
                System.out.println(animals[showAnimal].toString());
            } else break;
        }
    }
}

