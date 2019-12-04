package com.example;

import com.example.animals.Cow;
import com.example.animals.Pig;
import com.example.products.Products;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Cow());
        farm.addAnimal(new Cow("Cow1"));
        farm.addAnimal(new Cow());
        farm.addAnimal(new Pig("Pig1"));
        farm.addAnimal(new Cow());

        List<Products> products = farm.getProduct();
        System.out.println(products);
    }
}
