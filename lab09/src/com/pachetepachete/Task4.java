package com.pachetepachete;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(2);
        arr.add(1);

        GenericListMethods mt = new GenericListMethods();

        arr = mt.removeDuplicates(arr);

        System.out.println(mt.max(arr));
        System.out.println(arr);
        System.out.println(mt.binarySearch(arr, 2, 0, arr.size() - 1));

    }
}
