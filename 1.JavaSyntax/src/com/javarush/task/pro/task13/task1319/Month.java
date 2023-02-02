package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    public static Month[] getWinterMonths(){
        Month[] array = new Month[3];
        array[0] = Month.DECEMBER;
        array[1] = Month.JANUARY;
        array[2] = Month.FEBRUARY;
        return array;
    }

    public static Month[] getSpringMonths(){
        Month[] array = new Month[3];
        array[0] = Month.MARCH;
        array[1] = Month.APRIL;
        array[2] = Month.MAY;
        return array;
    }

    public static Month[] getSummerMonths(){
        Month[] array = new Month[3];
        array[0] = Month.JUNE;
        array[1] = Month.JULY;
        array[2] = Month.AUGUST;
        return array;
    }

    public static Month[] getAutumnMonths(){
        Month[] array = new Month[3];
        array[0] = Month.SEPTEMBER;
        array[1] = Month.OCTOBER;
        array[2] = Month.NOVEMBER;
        return array;
    }

}
