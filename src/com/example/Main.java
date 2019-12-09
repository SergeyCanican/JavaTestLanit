package com.example;

import com.example.animals.Cow;
import com.example.animals.Pig;
import com.example.products.Products;

import java.util.List;

public class Main {

    public static void main(String[] args, List<Products> product) {
        Farm farm = new Farm();
        farm.addAnimal(new Cow());
        farm.addAnimal(new Cow("Буренка"));
        farm.addAnimal(new Cow());
        farm.addAnimal(new Pig("Пеппа"));
        farm.addAnimal(new Pig());
        farm.addAnimal(new Pig("Хрюша"));
        farm.addAnimal(new Cow("Трушка"));

        //List<Products> products = farm.getProduct();
        System.out.println(farm.getProduct());
    }
}
