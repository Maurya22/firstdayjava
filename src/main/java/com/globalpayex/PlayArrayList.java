package com.globalpayex;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayArrayList {

    public static void main(String[] args) {
        var a = Arrays.asList(10,3,4,5,6);

//        for(Integer b : a){
//            if(b%2==0 && b>4){
//                    System.out.println(b);
//            }
//        }
        a.forEach(element ->{
            if(element % 2==0 && element>4){
                System.out.println(element);
            }
        });

        var name = Arrays.asList("Rakesh","Sunil","Juli","Ram");

        name.forEach(element ->{
            if(element.length()>4){
                System.out.println(element.toUpperCase());
            }
            else {
                System.out.println(element.toLowerCase());
            }
        });


    }
}
