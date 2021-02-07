package com.pachetepachete;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        IntegerMatrix m1 = new IntegerMatrix();
        IntegerMatrix m2 = new IntegerMatrix();

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l3.add(1);
        l3.add(2);
        l3.add(3);

        m1.add(l1);
        m1.add(l2);
        m1.add(l3);
        m2.add(l1);
        m2.add(l2);
        m2.add(l3);

        System.out.println(m1.addition(m2));

    }
}
