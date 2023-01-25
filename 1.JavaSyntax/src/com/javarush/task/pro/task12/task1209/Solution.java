package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        String s = "Иногрим";
        paySalary("Иногрим");
        System.out.println(alreadyGotSalaryEmployees);
        System.out.println(waitingEmployees);
    }

    public static void paySalary(String name) {
        if (name == null){
            
        } else if (!waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            
        } else if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}
