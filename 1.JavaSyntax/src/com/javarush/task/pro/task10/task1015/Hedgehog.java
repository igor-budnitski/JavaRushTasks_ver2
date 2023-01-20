package com.javarush.task.pro.task10.task1015;

/* 
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Hedgehog hg = new Hedgehog();
        Apple apple = new Apple();
        hg.eat(apple);
    }

    public static class Apple {
    }
}
