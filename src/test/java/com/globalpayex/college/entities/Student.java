package com.globalpayex.college.entities;

public class Student {
//    Object Attribute
//    instance variable
    String name;
    char gender;
    int roll;
    int mark;

   public String getDetails(){
        return "Name : "+this.name+"\nGender : "+this.gender+"\nRoll : "+this.roll+"\nMarks : "+this.mark;
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
