package com.globalpayex.college.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testObjectCreation(){
        var s1 = new Student();
        var s2 = new Student();

        assertTrue(s1 != s2);
        assertNull(s1.name);
        assertEquals(0, s1.roll);

        s1.roll=12;
        s2.roll=33;
        assertEquals(12,s1.roll);
        assertEquals(33,s2.roll);
    }

    @Test
    void testgetDetails(){
        var s1 = new Student();
        s1.name = "Rakesh";
        s1.roll =12;
        s1.gender='m';
        s1.mark=100;
        String expected = "Name : Rakesh\nGender : m\nRoll : 12\nMarks : 100";

        String actual = s1.getDetails();
        assertEquals(expected,actual);

    }

    @Test
    void testGrade(){
        var s1 =new Student();
        s1.mark =70;
        char expected = 'A';
        char actual = s1.grade();
        assertEquals(expected,actual);
    }
}