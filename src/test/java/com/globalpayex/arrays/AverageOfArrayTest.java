package com.globalpayex.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfArrayTest {

     @Test
    void testArray(){
         int[] arr1 = {0,2,4};
         var expected = 2;

         var actual = AverageOfArray.averagefinder(arr1);
          assertEquals(expected,actual);
     }

     @Test
    void testMaxArray(){
         int[] arr1 = {0,2,4};
         var expected = 4;

         var actual = AverageOfArray.maxfinder(arr1);
         assertEquals(expected,actual);

     }

     @Test
    void testNextGenSum(){
         int actual = AverageOfArray.nextGenSum(5,2,4,8);
         assertEquals(19, actual);

         actual = AverageOfArray.nextGenSum(5,2);
         assertEquals(7, actual);

         actual = AverageOfArray.nextGenSum(5);
         assertEquals(5, actual);
     }

}