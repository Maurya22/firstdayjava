package com.globalpayex;

public class Rectangle {

    public static double Perimeter(double length, double breath){
        var p = 2*(length+breath);
        return p;
    }
    public static double Area(double length, double breath){
        var a = length*breath;
        return a;
    }


}
