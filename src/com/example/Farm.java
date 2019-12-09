package com.example;

import com.example.animals.Animals;
import com.example.products.Products;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animals> animalsList = new ArrayList<>();

    public void addAnimal(Animals animal) {
        animalsList.add(animal);
        animal.makeSound();
    }

    public List<Products> getProduct() {
        List<Products> products = new ArrayList<>();
        for (Animals animal: animalsList) {
            Products product =  animal.getProduct();
            System.out.println(animal + " дала нам " + product);
            products.add(product);
        }
        return products;
    }
}
