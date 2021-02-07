package com.pachetepachete;

import java.io.File;
import java.util.*;
import java.util.logging.Logger;

public class Problema5 {
    public static HashMap<String, Long> descSort(HashMap<String, Long> mp)
    {
        List<Map.Entry<String, Long> > list =
                new LinkedList<Map.Entry<String, Long> >(mp.entrySet());

        list.sort(new Comparator<Map.Entry<String, Long>>() {
            public int compare(Map.Entry<String, Long> o1,
                               Map.Entry<String, Long> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<String, Long> ans = new LinkedHashMap<String, Long>();
        for (Map.Entry<String, Long> aa : list) {
            ans.put(aa.getKey(), aa.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeMap<String, Long> mp1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        HashMap<String, Long> mp2 = new HashMap<String, Long>();

        try {
            File director = new File ("/home/dumi/Documents/OOP/lab07/src/com/pachetepachete/fisiere_txt");
            String [] list;

            list = director.list();

            if (list != null) {
                for (int i = 0; i < list.length ; i ++) {
                    director = new File ("/home/dumi/Documents/OOP/lab07/src/com/pachetepachete/fisiere_txt/" + list[i]);
                    mp1.put(list[i], director.length());
                    mp2.put(list[i], director.length());
                }

            }

        } catch ( Exception e) { e. printStackTrace (); }

        mp2 = descSort(mp2);

        System.out.println(mp1);
        System.out.println(mp2);
    }
}
