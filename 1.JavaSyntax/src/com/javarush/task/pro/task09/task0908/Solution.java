package com.javarush.task.pro.task09.task0908;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String[] HEX = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private static final String[] binaryArray = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000",
            "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        StringBuffer sf = new StringBuffer();
        String result = "";
        //Check for empty String or if equals null
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        }
        //check if String contains any chars except 1 or 0
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                return "";
            }
        }
        //Modify string in case it is not %4 != 0
        if (binaryNumber.length() % 4 != 0) {
            while (binaryNumber.length() % 4 != 0) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        // binary to HEX part
        int counter = 0;
        String check = "";
        for (int i = 0; i < binaryNumber.length(); i++) {
            check += binaryNumber.charAt(i);
            counter++;
            if (counter == 4) {
                int index = Arrays.binarySearch(binaryArray, check);
                counter = 0;
                check = "";
                result += Array.get(HEX, index);
            }
        }
        return result;
    }

    public static String toBinary(String hexNumber) {
        String result = "";
        // check if String is empty or null
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }
        // check that String contains only 0-9 chars and a-f chars
        for (int i = 0; i < hexNumber.length(); i++) {
            if ((hexNumber.charAt(i) >= '0') && (hexNumber.charAt(i) <= '9') ||
                    (hexNumber.charAt(i) >= 'a') && (hexNumber.charAt(i) <= 'f')) {
            } else {
                return "";
            }
        }
        //hex to binary
        String check = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            check += hexNumber.charAt(i);
            int index = Arrays.binarySearch(HEX, check);
            result += Array.get(binaryArray, index);
            check = "";
        }
        return result;
    }
}
