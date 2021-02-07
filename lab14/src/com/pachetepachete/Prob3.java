package com.pachetepachete;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Prob3 {
    public static void main(String[] args) {
        try {
            LineNumberReader rd = new LineNumberReader(new FileReader("./src/com/pachetepachete/test01.in"));
            String str = null;
            int nr = 0;

            while((str = rd.readLine())!=null) {
                nr = rd.getLineNumber();

                if (nr % 2 != 0) {
                    System.out.print(nr+". ");
                    System.out.println(str);
                }
            }
            rd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
