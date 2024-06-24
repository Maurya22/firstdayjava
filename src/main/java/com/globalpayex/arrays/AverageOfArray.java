package com.globalpayex.arrays;

public class AverageOfArray {
    public static double averagefinder(int[] arr1) {
        int sum =0;
        for(int i =0; i<arr1.length; i++){
            sum = arr1[i]+sum;
        }
        double result = (double) sum/arr1.length;
        return result;
    }

    public static int maxfinder(int[] arr1) {
        int maximum = arr1[0];
        for(int arr : arr1){
            if(arr>maximum){
                maximum = arr;
            }
        }
        return maximum;
    }

    public static int nextGenSum(int... elements) {
        int sum =0;
        for(int element : elements){
            sum += element;
        }
        return sum;
    }
}
