package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        if (Arrays.binarySearch(arrayCopy, element) >= 0){
            boolean check = true;
            System.out.println(check);
        }else {
            boolean check = false;
            System.out.println(check);
        }
    }
}
