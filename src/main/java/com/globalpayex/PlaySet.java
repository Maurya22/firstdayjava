package com.globalpayex;

import java.util.Arrays;
import java.util.HashSet;

public class PlaySet {
    public static void main(String[] args) {
        HashSet<String> uniquesName = new HashSet<>();
        uniquesName.add("Rakesh");
        uniquesName.add("Raj");
        uniquesName.add("Rakesh");
        System.out.println(uniquesName);

        var list = Arrays.asList(1,5,6,7,1,10,34);
        HashSet<Integer> uniquemarks = new HashSet<>(list);
        System.out.println(uniquemarks);

        var mDiva = Arrays.asList(1,3,5);
        var mDivb = Arrays.asList(1,2,5);
        HashSet<Integer> s1 = new HashSet<>(mDiva);
        HashSet<Integer> s2 = new HashSet<>(mDivb);
        s1.retainAll(s2);
        System.out.println(s1);

//        All the unique marks score divison
        HashSet<Integer> s3 = new HashSet<>(mDiva);
        HashSet<Integer> s4 = new HashSet<>(mDivb);
        s3.addAll(s4);
        System.out.println(s3);

    }
}
