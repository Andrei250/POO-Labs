package com.pachetepachete;

import java.io.File;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class Prob5 {
    public static void main(String[] args) {

        try {
            FileReader in = new FileReader(new File("./src/com/pachetepachete/test02.in"));
            StreamTokenizer str = new StreamTokenizer(in);

            int counter = 0;

            while(str.nextToken()!=StreamTokenizer.TT_EOF){
                counter++;
            }

            System.out.println(counter);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
