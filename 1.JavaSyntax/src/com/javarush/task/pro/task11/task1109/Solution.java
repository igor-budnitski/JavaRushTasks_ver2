package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner inner1 = ot.new Inner();
        Outer.Nested ns = new Outer.Nested();
    }
}
