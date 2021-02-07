package com.pachetepachete;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        try {
            DataInputStream rd = new DataInputStream(System.in);
            boolean check = true;
            FileWriter wr = new FileWriter("./src/com/pachetepachete/cuvinte.txt");


            while (check) {
                String line = rd.readLine();
                Scanner sn = new Scanner(line);

                while (sn.hasNext()) {
                    String toke = sn.next();

                    if (toke.equals("exit")) {
                        check = false;
                        break;
                    }

                    wr.write(toke + " ");
                }
                wr.write("\n");
            }

            wr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
