package com.globalpayex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayList {

    @Test
    void testArrayList(){
        ArrayList<String> cars = new ArrayList<>();
        assertEquals(0, cars.size());

//        add
        cars.add("I10");
        cars.add("I20");
        assertEquals("I20", cars.get(1));
        cars.add(1,"mercides");
        assertEquals("mercides", cars.get(1));
        assertEquals("I20", cars.get(2));

//        update
        cars.set(0, "audi");
        assertEquals("audi", cars.get(0));
// remove
        cars.remove(0);
        assertEquals("mercides", cars.get(0));
        cars.remove("mercides");
        assertEquals("I20",cars.get(0));
        assertFalse(cars.isEmpty());

        assertTrue(cars.contains("I20"));
    }


    @Test
    void testSortingAscending(){
        var a = Arrays.asList(10,3,4,5,6);
        Collections.sort(a);
        assertEquals(3,a.get(0));

 }
    @Test
    void testSortingDescending(){
//        inner class
//        class DescComparator implements Comparator<Integer> {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        }
        var a = Arrays.asList(10,3,4,5,6);
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
//        assertEquals(10,a.get(0));
//        Collections.sort(a,((o1, o2) -> o2.compareTo(o1)));
        Collections.sort(a, Collections.reverseOrder());

        System.out.println(a);


    }

    @Test
    void testEvenNosMoreThan2(){
       var n = Arrays.asList(4,5,6,7,8);
//       var actual = new ArrayList<Integer>();
//
//        var expected = Arrays.asList(4,6,8);
//        n.forEach(element ->{
//            if(element % 2==0 && element>2){
//                actual.add(element);
//            }
//        });
//        assertEquals(expected,actual);
        var expected = Arrays.asList(4,6,8);
        var actual = n.stream()
                .filter(element -> element % 2 ==0 && element>2)
                .collect(Collectors.toList());
        assertEquals(expected,actual);

    }


}
