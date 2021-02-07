package com.pachetepachete;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collection;

public class Test04 {
    public static void main(String[] args) {

        Filtru filtru = new Filtru();

        try {
            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("/home/dumi/Documents/OOP/lab-6/src/com/pachetepachete/words.in", "rw");

            String tmp;
            while((tmp = raf.readLine()) != null) {
                filtru.addWord(tmp);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("/home/dumi/Documents/OOP/lab-6/src/com/pachetepachete/extension.in", "rw");

            String tmp;
            while((tmp = raf.readLine()) != null) {
                filtru.addName(tmp);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {

            File director = new File ("/home/dumi/Documents/OOP/lab-6/src/com/pachetepachete/director");

            String[] directories = director.list();

            for (String dir : directories) {
                director = new File("/home/dumi/Documents/OOP/lab-6/src/com/pachetepachete/director/" + dir);
                String [] list;

                list = director.list(filtru);

                if (list != null) {
                    for (int i = 0; i < list.length ; i ++)
                        System.out.println (list [i]);
                }
            }
        } catch ( Exception e) { e. printStackTrace (); }

    }
}
