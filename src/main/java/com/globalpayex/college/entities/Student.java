package com.globalpayex.college.entities;

public class Student extends CollegeUser {
//    Object Attribute
//    instance variable
    int roll;
    public static int mark;
    static int count;
    public Student(){
        this("NA",-1,'m',0);
    }

    public Student(String name, int roll, char gender, int mark) {
        super(name,gender);
        Student.count++;
        this.roll=roll;
        this.setGender(gender);
        this.mark=mark;
    }

    public static Student createInstance(String name, int roll,char gender, int mark) {
        var s = new Student(name,roll,gender,mark);
        return s;
    }

    @Override
    public String getDetails() {
        String part1 = super.getDetails();
        return String.format(
                "%s\nRoll : %s\nMarks : %s",
                part1,
                this.roll,
                this.mark
        );
    }

    public char grade() {
        if(this.mark>=70){
            return 'A';
        }
        else if(this.mark>60){
            return 'B';
        }
        else if(this.mark>=50){
            return 'C';
        }
        return 'F';

    }


}
