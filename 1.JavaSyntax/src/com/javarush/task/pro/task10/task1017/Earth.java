package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(34_232_112);
        Eurasia eurasia = new Eurasia(3_000_000);
        NorthAmerica northAmerica = new NorthAmerica(2_000_221);
        SouthAmerica southAmerica = new SouthAmerica(2_000_221);
        Antarctica antarctica = new Antarctica(2_000_221);
        Australia australia = new Australia(4_232_223);
    }
}
