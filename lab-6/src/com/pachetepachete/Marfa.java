package com.pachetepachete;

public class Marfa extends Vagon {
    public Marfa() {
        super(0, 400);
    }

    @Override
    public void inchidereUsiAutomat() {
        System.out.println("Nu are inchidere automata");
    }

    @Override
    public void deschidereUsiAutomat() {
        System.out.println("Nu are deschid automata");
    }

    @Override
    public void blocareGeamuri() {
        System.out.println("Geamurile sunt acitonate manual");
    }
}
