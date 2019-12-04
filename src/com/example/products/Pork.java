package com.example.products;

public class Pork implements Products {
    private int volume;

    @Override
    public String toString() {
        return String.format("Pork %d Kilogramms", volume);
    }

    public Pork(int volume) {
        this.volume = volume;
    }
}
