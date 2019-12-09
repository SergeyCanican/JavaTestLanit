package com.example.animals;

import com.example.products.Milk;
import com.example.products.Products;

import java.util.Random;

public class Cow implements Animals {
    private int volume = new Random().nextInt(13) + 2;
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    public Cow() {
        name = "Безымянная";
    }

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Myy-Муу");
    }

    @Override
    public Products getProduct() {
        Products milk = new Milk(volume);
        volume = 0;
        return milk;
    }
}
