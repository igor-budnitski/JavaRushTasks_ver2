package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        int res = number | (1 << flagPos);
        return res;
    }

    public static int resetFlag(int number, int flagPos) {
        int res = number & ~(1 << flagPos);
        return res;
    }

    public static boolean checkFlag(int number, int flagPos) {
        boolean res = (number & (1 << flagPos)) == (1 << flagPos);
        return res;
    }
}
