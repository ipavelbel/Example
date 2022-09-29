package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorting extends Exception {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter 10 numbers separated by spaces");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] items = input.split(" ");

        int[] arguments = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            arguments[i] = Integer.parseInt(items[i]);
        }

        System.out.println("Entered array "+Arrays.toString(arguments));
        sort(arguments);

        System.out.println("Sorted array "+Arrays.toString(arguments));

    }

    public static String sort(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("you didn't enter any arguments");
        }

        if (array.length == 1) {
            throw new IllegalArgumentException("only 1 argument passed");
        }
        if (array.length > 10) {
            throw new IllegalArgumentException("more than 10 arguments passed");
        }

        Arrays.sort(array);
        return Arrays.toString(array);
    }
}