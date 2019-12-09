package com.example.products;

public class Milk implements Products {
    private int volume;

    public Milk(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Молока %d литра(ов)", volume);
    }
}
