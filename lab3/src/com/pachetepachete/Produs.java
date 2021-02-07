package com.pachetepachete;

public class Produs {
    String nume;
    double pret;
    int cantitate;

    public Produs(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public double getTotalProdus() {
        return this.pret * this.cantitate;
    }

    @Override
    public String toString() {
        return "Produs " + this.nume + " " + this.pret + " " + this.cantitate + "!";
    }

}
