package com.pachetepachete;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Problema1 {

    public TreeSet printWords (String name) {
        TreeSet ts1 = new TreeSet();

        try {
            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("/home/dumi/Documents/OOP/lab07/src/com/pachetepachete/" + name, "r");

            String tmp;
            while((tmp = raf.readLine()) != null) {
                Scanner wordScanner = new Scanner(tmp);
                wordScanner.useDelimiter("[^\\p{Alpha}']+");
                while (wordScanner.hasNext()) {
                    String s = wordScanner.next();
                    ts1.add(s);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return ts1;
    }

    public TreeSet prinWordsComparator (TreeSet tr) {
        TreeSet ts2 = new TreeSet(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) < 0) {
                    return 1;
                } else if (o1.compareTo(o2) > 0){
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return obj == this;
            }
        });

        for (Object ob : tr) {
            ts2.add(ob);
        }
        return ts2;
    }

    public static void main(String[] args) {
        Problema1 obj = new Problema1();
        TreeSet ts1 = obj.printWords("test01.txt");
        TreeSet ts2 = obj.prinWordsComparator(ts1);

        System.out.println("Primul tree###########################################################################");
        for (Object ob : ts1) {
            System.out.println((String) ob);
        }

        System.out.println("Al doilea tree##########################################################################");

        for (Object ob : ts2) {
            System.out.println((String) ob);
        }

    }
}
