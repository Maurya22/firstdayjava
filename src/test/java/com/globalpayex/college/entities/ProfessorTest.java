package com.globalpayex.college.entities;

import abc.salary.SalaryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @BeforeEach
    void init(){
        Professor.count =0;
    }
    @Test
    void testProfessor(){
        assertEquals(0, Professor.count);
        String[] subjects1 = {"Math", "Physics"};
        String[] subjects2 = {"Chemistry", "Physics"};
        var p1 = new Professor("Raj",'m', subjects1, 15, 6000);
        var p2 = new Professor("Rakesh",'m',subjects2,22, 9000);
        assertEquals(2,Professor.count);
    }

    @Test
    void testgetDetails() {
        String[] subjects1 = {"Math", "Physics"};
        var p1 = new Professor("Rakesh", 'm', subjects1, 17, 7000);
        String expected = "Name : Rakesh\nGender : m";

        String actual = p1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void testSalaryOfPreofessor(){
        String[] subjects1 = {"Math", "Physics"};
        var p1 = new Professor("Rakesh", 'm', subjects1, 17, 7000);
        var expected = 106920;
        var actual = p1.calculate();
        assertEquals(expected,actual);
    }



}