package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListOfStudentTest {

    @Test
    void testAverage(){
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Rakesh", 12, 'm', 100));
        s.add(new Student("Sunil", 16, 'm', 60));
        double expected = 80;
        double actual = ArrayListOfStudent.averageCalculator(s);

        }






    }

