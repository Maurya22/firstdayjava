package com.globalpayex;

public class GradeDistribution {

    public static char grade(int n) {
        if(n>=70){
            return 'A';
        }
        else if(n>60){
            return 'B';
        }
        else if(n>=50){
            return 'C';
        }
        return 'F';

    }
}
