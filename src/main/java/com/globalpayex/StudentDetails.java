package com.globalpayex;

public class StudentDetails {

    public static String student(String name, int rollno , int age, int marks) {
         return "Name :"+ name+"\n"+"Roll no :"+rollno+"\n"+"Age :"+age+"\n"+"Marks :"+marks;

    }


    public static char grade(int marks) {
        if(marks>=70){
            return 'A';
        }
        else if(marks>60){
            return 'B';
        }
        else if(marks>=50){
            return 'C';
        }
        return 'F';

    }
}
