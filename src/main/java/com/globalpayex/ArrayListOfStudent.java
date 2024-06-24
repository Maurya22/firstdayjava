package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.ArrayList;

public class ArrayListOfStudent {

    public static double averageCalculator(ArrayList<Student> students){
        int sum =0;
        for(Student student : students ){
            sum +=student.getMark();
        }
        return sum/students.size();


    }
}
