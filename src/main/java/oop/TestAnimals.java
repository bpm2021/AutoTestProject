package oop;


import oop.classes.Cat;
import oop.classes.Dog;

public class TestAnimals {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.voice();
        cat.voice();

        dog.voice("Тест мяу!");
        cat.voice("Тест гав!");
    }
}
