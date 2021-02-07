package com.pachetepachete;

import java.util.Vector;

public class Problema4 {

    public static void main(String[] args) {
        Vector<Integer> arr1 = new Vector<Integer>();
        Vector<Integer> arr2 = new Vector<Integer>();

        arr1.add(2);
        arr1.add(12);
        arr1.add(13);
        arr1.add(14);
        arr1.add(30);
        arr1.add(25);
        arr1.add(20);
        arr1.add(1);
        arr1.add(4);
        arr1.add(15);
        arr1.add(3);

        arr2.add(266);
        arr2.add(12);
        arr2.add(133);
        arr2.add(14);
        arr2.add(35);
        arr2.add(24);
        arr2.add(13);
        arr2.add(1);
        arr2.add(4);
        arr2.add(65);
        arr2.add(3);

        //reuniunea
        Vector<Integer> reunion = new Vector<>();

        for (int i = 0; i < arr1.size(); ++i) {
            if (! reunion.contains(arr1.get(i))) {
                reunion.add(arr1.get(i));
            }
        }

        for (int i = 0; i < arr2.size(); ++i) {
            if (! reunion.contains(arr2.get(i))) {
                reunion.add(arr2.get(i));
            }
        }

        System.out.println(reunion.toString());

        //intersectie
        Vector<Integer> intersection = new Vector<>();

        for (Integer i : arr1) {
            if (arr2.contains(i)) {
                intersection.add(i);
            }
        }

        System.out.println(intersection.toString());


        //diferenta
        Vector<Integer> diff = new Vector<>();

        for (Integer i : arr1) {
            if (!intersection.contains(i)) {
                diff.add(i);
            }
        }

        System.out.println(diff.toString());

    }
}
