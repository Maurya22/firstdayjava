package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Random;

public class UniversalSelection {
    public static <T> T surpriseMe(T[] elements){
        Random random = new Random();
        int n = random.nextInt(elements.length);
        return elements[n];

    }

    public static void main(String[] args) {
        String[] movies = {"3 idiots", "Avatar", "Robot"};
        String movie = surpriseMe(movies);
        System.out.println(movie);

        Student[] students = {
                new Student("Rakesh", 12,'m',100),
                new Student("Sunil", 16,'m',60),
                new Student("Ranjeet", 14,'m',13),
                new Student("Priti", 1,'f',50),
        };
        Student monitor = surpriseMe(students);
        System.out.println(monitor);


    }

}
