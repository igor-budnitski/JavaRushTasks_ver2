package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Igor", 4.3);
        grades.put("Dmitri", 4.1);
        grades.put("Anton", 5.0);
        grades.put("Svetlana", 3.2);
        grades.put("Sergei", 2.4);
    }
}
