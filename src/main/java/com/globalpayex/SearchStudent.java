package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SearchStudent {

    public static void main(String[] args) {
//        var students = Arrays.asList(
//                new Student("Rakesh", 12, 'm', 100),
//                new Student("Juli", 16, 'f', 54),
//                new Student("Roshni", 2, 'f', 97),
//                new Student("Raj", 13, 'm', 76)
//
//        );

        HashMap<Integer, Student> map = new HashMap<>();
        map.put(12,new Student("Rakesh", 12, 'm', 100));
        map.put(16,new Student("Juli", 16, 'f', 54));
        map.put(2, new Student("Roshni", 2, 'f', 97));

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Roll Number : ");
        int rollno = sc.nextInt();

//Not required
//        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
//            if(entry.getKey()==rollno){
//                System.out.println(entry.getValue());
//            }

//        1st method
//         if(map.containsKey((rollno))){
//             System.out.println(map.get(rollno));
//        } else {
//             System.out.println("Not found");
//         }

//        2nd method
        Student student=map.get(rollno);
        if(student!=null){
            System.out.println(student);
        }else {
            System.out.println("Not found");
        }

//       if(students.contains((new Student("",rollno, 'm',0)))){
//           System.out.println("found");
//       } else {
//           System.out.println("Not found");
//       }

//        var match = students.stream()
//                .filter(student -> student.roll==rollno)
////                .collect(Collectors.toList());
//                .findFirst();
//
//        if(match.isPresent()){
//            System.out.println(match.get());
//        }
//        else {
//            System.out.println("Not found");
//        }
    }
}
