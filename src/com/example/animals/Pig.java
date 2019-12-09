package com.example.animals;

import com.example.products.Pork;
import com.example.products.Products;

import java.util.Random;

public class Pig implements Animals {
    private int volume = new Random().nextInt(10) + 5;
    private String pig1;
    private final String name;

    public Pig(String name) {
        this.name = name;
    }

    public Pig() {
        name = "Безымянная";
    }

    @Override
    public String toString() {
        return "Имя свинки -  " + name;
    }

    @Override
    public void makeSound() {
        System.out.println("Хрю-хрю");
    }

    @Override
    public Products getProduct() {
        Products pork = new Pork(volume);
        volume = 0;
        return pork;
    }
}
