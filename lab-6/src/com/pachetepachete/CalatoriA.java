package com.pachetepachete;

public class CalatoriA extends Vagon {
    public CalatoriA() {
        super(40, 300);
    }

    public CalatoriA(int persoane, int capacitate) {
        super(persoane, capacitate);
    }

    @Override
    public void inchidereUsiAutomat() {
        System.out.println("Usile se inchid automat");
    }

    @Override
    public void deschidereUsiAutomat() {
        System.out.println("Usile se deschid automat");
    }

    @Override
    public void blocareGeamuri() {
        System.out.println("Se executa manual geamurile");
    }
}
