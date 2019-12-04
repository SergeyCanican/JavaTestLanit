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
        name = "no-name";
    }

    @Override
    public String toString() {
        return "Pig name - " + name;
    }

    @Override
    public void makeSound() {
        System.out.println("Hru-Hru");
    }

    @Override
    public Products getProduct() {
        Products pork = new Pork(volume);
        volume = 0;
        return pork;
    }
}
