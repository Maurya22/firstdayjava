package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {


    @Test
    void testGetArray(){
        Integer[] arr = {1,3,4,5,6};
        var v1 = new MyArray<Integer>(arr);
        var expected = 3;
        assertEquals(expected,v1.get(2));
        v1.set(3,9);
        assertEquals(9,v1.get(3));
    }

    @Test
    void testMyArrayOfStudent(){
        Student[] students = new Student[]{
                new Student("Rakesh", 12, 'm', 100),
                new Student("Sunil", 16, 'm', 60),
                new Student("Ranjeet", 14, 'm', 13),
                new Student("Priti", 1, 'f', 50),};
//                var s = new MyArray<Student>(students);
                MyArray<Student> s = new MyArray<>(students);

        assertEquals("Rakesh",s.get(1).getName());
        s.set(2, new Student("Priya", 14, 'f', 56));
        assertEquals("Priya",s.get(2).getName());
    }


}