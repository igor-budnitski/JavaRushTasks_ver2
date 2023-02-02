package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javaRushQuests = JavarushQuest.values();

/*        for (JavarushQuest quests : javaRushQuests) {
            System.out.println(quests);
        }*/

        for (JavarushQuest quests:javaRushQuests) {
            System.out.println(quests.ordinal());
        }
    }
}
