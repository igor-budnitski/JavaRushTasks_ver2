package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        int rows, collumns;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        multiArray = new int[rows][];
        for (int i = 0; i < multiArray.length; i++) {
            collumns = sc.nextInt();
            multiArray[i] = new int[collumns];
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}
