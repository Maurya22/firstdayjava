package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintSeriesTest {

    @Test
    void testprintevenseries(){
        var n =11;
        var expected = "0,2,4,6,8,10";
        var actual = PrintSeries.evenSeries(n);

        assertEquals(expected,actual);

        n =8;
        expected = "0,2,4,6,8";
        actual = PrintSeries.evenSeries(n);

        assertEquals(expected,actual);
    }

}