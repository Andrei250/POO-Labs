package com.pachetepachete;

import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        ArrayMap<Integer, String> mp = new ArrayMap<>();

        mp.put(2, "DA");
        mp.put(3, "DsdA");
        mp.put(4, "DAfda");
        mp.put(5, "Dfdsa");
        mp.put(2, "Nu");

        System.out.println(mp.get(2));
        System.out.println(mp);

        Set<Map.Entry<Integer, String>> entries = mp.entrySet();
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Integer, String> e : entries) {
            ans.append("Key: ").append(e.getKey()).append(" Value: ").append(e.getValue()).append('\n');
        }

        System.out.println(ans);
    }
}
