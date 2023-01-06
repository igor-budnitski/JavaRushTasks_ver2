package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);
            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
        System.out.println("****************************************");
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("http") || url.startsWith("https")){
            if (url.startsWith("https")){
                return url.substring(0,5);
            }else {
                return url.substring(0,4);
            }
        }else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com") || url.endsWith("net") || url.endsWith("org") || url.endsWith("ru")){
            String[] b = url.split("\\.");
            return b[b.length-1].toString();
        }
        return "неизвестный";
    }
}
