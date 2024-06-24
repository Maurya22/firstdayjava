package com.globalpayex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
public class TestHashMap {

    @Test
    void testMap1(){
        HashMap<Integer, String> map = new HashMap<>();
        assertEquals(0,map.size());
        map.put(10,"Rakesh");
        map.put(5,"juli");
        assertEquals(2,map.size());


//        get an value of an entry

        assertEquals("Rakesh",map.get(10));
        assertEquals("juli",map.get(5));

//        update an entry in map
        map.put(5,"Raj");
        assertEquals("Raj",map.get(5));

//        delete an entry from the map
        map.remove(5);
        assertEquals(1,map.size());

//        get a list of all the values from the map
        var values = map.values();
        System.out.println(values);
//        get a list of all the keys from the map
        var keys = map.keySet();
        System.out.println(keys);

    }
}
