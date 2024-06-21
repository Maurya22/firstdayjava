package com.globalpayex.geometry.entities;

import abc.geometry.ShapeStatistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea(){
        var p1 = new Rectangle(4,2);
        var expected = 8;
        var actual = p1.area();
        assertEquals(expected,actual);
    }

    @Test
    void testPerimeter(){
        var p1 = new Rectangle(4,2);
        var expected = 12;
        var actual = p1.perimeter();
        assertEquals(expected,actual);
    }

    @Test
    void testShapeStatistics(){
        var r1 = new Rectangle(4,2);
        var expected = "***\nArea is 8.0\nPerimeter is 12.0";
        String actual = ShapeStatistics.calculate(r1);
        assertEquals(expected,actual);
    }

    @Test
    void testShapeStatisticssquare(){
        var r1 = new Square(4);
        var expected = "***\nArea is 16.0\nPerimeter is 16.0";
        String actual = ShapeStatistics.calculate(r1);
        assertEquals(expected,actual);
    }

}