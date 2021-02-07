package com.pachetepachete;

import java.util.HashMap;
import java.util.Vector;

public class Problema6 {

    public static void main(String[] args) {
        Vector v = new Vector();
        HashMap<String, Integer> mp = new HashMap<>();

        v.add(1);
        v.add(2);
        v.add(2.2);
        v.add(3.2);
        v.add(5.2);
        v.add("Paine");
        v.add('c');

        for (int i = 0; i < v.size(); ++i) {
            if (!mp.containsKey(v.get(i).getClass().toString())) {
                mp.put(v.get(i).getClass().toString(), 1);
            } else {
                mp.replace(v.get(i).getClass().toString(), mp.get(v.get(i).getClass().toString()) + 1);
            }
        }

        System.out.println(mp);

    }
}
