package com.aLavel.Ivanishiv.animal;
public abstract class AbstractAnimal {
    private int age;
    private String name;

    public AbstractAnimal(){
    };
    public AbstractAnimal(int age, String name){
        this.name = name;
        this.age = age;
    }

    public abstract String getAnimalClass();

    public abstract String say();

    @Override
    public String toString() {
        return getAnimalClass() +
                " age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getMaxAge();
}
