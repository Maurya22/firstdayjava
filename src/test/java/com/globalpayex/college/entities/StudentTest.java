package com.globalpayex.college.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void init(){
        Student.count =0;
    }

    @Test
    void testObjectCreation(){
        assertEquals(0, Student.count);
        var s1 = new Student();
        var s2 = new Student();

        assertTrue(s1 != s2);
//        assertNotNull(s1.name);
//        assertEquals(0, s1.roll);

//        s1.roll=13;
//        s2.roll=-10;
        assertEquals(-1,s1.roll);
        assertEquals(-1,s2.roll);

        assertEquals(2,Student.count);
    }

    @Test
    void testgetDetails(){
        var s1 = new Student("Rakesh",12,'m',100);
//        s1.name = "Rakesh";
//        s1.roll =12;
//        s1.gender='m';
//        s1.mark=100;
        String expected = "Name : Rakesh\nGender : m\nRoll : 12\nMarks : 100";

        String actual = s1.getDetails();
        assertEquals(expected,actual);

        System.out.println(s1);


    }

    @Test
    void testGrade(){
        var s1 =new Student();
//        s1.getMark() =70;
        char expected = 'A';
        char actual = s1.grade();
        assertEquals(expected,actual);
    }

    @Test
    void testNewWayOfStudentCreation(){
        var s1 = Student.createInstance("Rakesh", 12, 'm',100);
        String expected = "Name : Rakesh\nGender : m\nRoll : 12\nMarks : 100";

        String actual = s1.getDetails();
        assertEquals(expected,actual);


    }
    @Test
    void testValidGender(){
        var s = new Student();
//        s.gender ='m' It is private
        s.setGender('f');
        assertNotEquals('m',s.getGender());

        s.setGender('m');
        assertNotEquals('f',s.getGender());

        var s1 = new Student("Rakesh",12,'x',100);
        assertNotEquals('x', s1.getGender());

    }

}