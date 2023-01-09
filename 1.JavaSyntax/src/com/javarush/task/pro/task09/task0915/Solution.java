package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] words = query.split("\\.");
        int index = words.length;
        String[] strArray = new String[index];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = st.nextToken();
        }
        return strArray;
    }
}
