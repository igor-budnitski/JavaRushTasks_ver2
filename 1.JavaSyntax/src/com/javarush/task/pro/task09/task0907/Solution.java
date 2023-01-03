package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
            String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0){
            return "";
        }
        String result = "";
        while(decimalNumber > 0){
            int reminder = decimalNumber % 16;
            if (reminder < 10){
                result = reminder + result;
                decimalNumber = decimalNumber / 16;
            }else {
                result = HEX.charAt(reminder) + result;
                decimalNumber = decimalNumber / 16;
            }
        }
        return result;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("")){
            return 0;
        }
        int result = 0;
        int power = hexNumber.length() - 1;
        for (int i = 0; i < hexNumber.length(); i++) {
            result = result + (Character.getNumericValue(hexNumber.charAt(i)) * (int) Math.pow(16, power));
            power -= 1;
        }
        return result;
    }
}
