package com.globalpayex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GradeDistributionTest {

    @ParameterizedTest
    @CsvSource({
            "71,A",
            "70,A",
            "60,C"
    })

      void testGradeDistribution(int marks, char expected){

        char actual = GradeDistribution.grade(marks);

         assertEquals(expected,actual);

    }

}