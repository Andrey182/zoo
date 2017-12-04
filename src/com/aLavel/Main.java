package com.aLavel;

import com.aLavel.Ivanishiv.AnimalResolver;
import com.aLavel.Ivanishiv.MenuType;
import com.aLavel.Ivanishiv.Zoo;
import com.aLavel.Ivanishiv.animal.AbstractAnimal;
import com.aLavel.WorkInFile;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(MenuType.ZOO_MENU.getMenuLine());
        Scanner scanner = new Scanner(System.in);
        String zooName = scanner.nextLine();
        Zoo zoo = new Zoo();

        System.out.println(MenuType.ZOO_CHOICE_MENU.getMenuLine());

        int zooChoice = scanner.nextInt();
        if (zooChoice == 1) {
            String fileName = "FileUtils.txt";
            String textFromFile = WorkInFile.read(fileName);
            System.out.println(textFromFile);
        } else {
            while (zoo.isFull() == false) {
                System.out.println(MenuType.MAIN_MENU.getMenuLine());
                int animlNumber = scanner.nextInt();
                AbstractAnimal animal = AnimalResolver.resolveAnimal(animlNumber);

                zoo.addAnimal(animal);

                zoo.addAnimalName(animal);

                zoo.addAnimalAge(animal);


                if (zoo.isFull() == true) {
                    System.out.println(MenuType.ADD_ZOO_ANIMAL.getMenuLine());
                    int addZoo = scanner.nextInt();
                    if (addZoo == 1) {
                        zoo.extendZooSize();
                    }
                }
            }
            System.out.println(zoo);
            zoo.showAnimal();
        }
    }
}
