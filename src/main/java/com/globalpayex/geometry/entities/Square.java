package com.globalpayex.geometry.entities;

import abc.geometry.Shape;

public class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double area() {
        return this.side*this.side;
    }

    @Override
    public double perimeter() {
        return 4*this.side;
    }
}
