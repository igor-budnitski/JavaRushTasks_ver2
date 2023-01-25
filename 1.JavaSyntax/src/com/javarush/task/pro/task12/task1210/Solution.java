package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Переворачивание данных
*/

public class Solution {
    public static int[] numbers = new int[10];

    public static void main(String[] args) {
        init();
        print();
        System.out.println();
        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public static void reverse() {
        ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(numbers));

    }

    private static void print() {
        for (int number : numbers) {
            System.out.print(number);
        }
    }
}
