package com.pachetepachete;

public class Problema1 {

    public static void main(String[] args) {
        String s1 = "si";
        String s2 = "sir1 si cu sir2 fac un sir3";

        int counter = 0;
        int initialIndex = 0;

        while (s2.indexOf(s1, initialIndex) != -1) {
            initialIndex = s2.indexOf(s1, initialIndex) + 1;
            counter ++;
        }

        System.out.println(counter);
    }
}
