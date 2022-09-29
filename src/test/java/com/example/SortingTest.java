package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SortingTest {

    public Sorting sorting = new Sorting();

    private int[] arrayTest;
    private String expected;

    public SortingTest(int[] arrayTest, String expected) {
        this.arrayTest = arrayTest;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection input(){
        int[] array1 = {5, 2},
                array2 = {95, 31, -1, 1},
                array3 = {198, 63, -100, 0, 58, 4},
                array4 = {5, 5, 1, 1, 4, 4, 5, 99, 15, 54};
        return Arrays.asList(new Object[][]{
                {array1, "[2, 5]"},
                {array2, "[-1, 1, 31, 95]"},
                {array3, "[-100, 0, 4, 58, 63, 198]"},
                {array4, "[1, 1, 4, 4, 5, 5, 5, 15, 54, 99]"}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroArgsCase(){
        int[] zeroArgsArray = new int[0];
        Sorting.sort(zeroArgsArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOneArgCase(){
        int[] oneArgArray = new int[1];
        Sorting.sort(oneArgArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThanTenArgsCase(){
        int[] zeroArray = new int[11];
        Sorting.sort(zeroArray);
    }

    @Test
    public void testTwoToTenAgrsCase(){
        assertEquals(expected, Sorting.sort(arrayTest));
    }


}