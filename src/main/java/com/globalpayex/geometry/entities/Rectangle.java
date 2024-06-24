package com.globalpayex.geometry.entities;

import abc.geometry.Shape;

public class Rectangle extends Shape {
    private double length;
    private double  breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breath=" + breath +
                '}';
    }

    public double perimeter(){
        double p=2*(this.length+this.breath);
        return p;
    }
    public double area(){
        double a = this.length*this.breath;
        return a;
    }

}
