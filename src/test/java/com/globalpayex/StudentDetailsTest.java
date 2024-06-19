package com.globalpayex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentDetailsTest {

    @Test
    void teststudentsdata(){
        var name = "Ashish";
        var rollno = 12;
        var age = 21;
        var marks = 75;

        var expected = "Name :Ashish\nRoll no :12\nAge :21\nMarks :75";
        var actual = StudentDetails.student(name,rollno,age,marks);

        assertEquals(expected,actual);

    }

}