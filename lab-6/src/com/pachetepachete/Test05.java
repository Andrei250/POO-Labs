/*
 * Programare orientata pe obiecte
 * Seria CC
 * Laboratorul 6
 */
package com.pachetepachete;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 *
 * @author Nan Mihai
 */
class Problema5
{
    public static void main(String args[]) {
        Tren t = new Tren();
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriB());
        t.addVagon(new Marfa());

        System.out.println(t);

        Tren t1 = new Tren();
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new Marfa());
        t1.addVagon(new Marfa());
        t1.addVagon(new Marfa());

        Vector<Tren> trains = new Vector<>();

        trains.add(t);
        trains.add(t1);

        Collections.sort(trains, new Comparator<Tren>() {
            @Override
            public int compare(Tren o1, Tren o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(trains);

    }
}
