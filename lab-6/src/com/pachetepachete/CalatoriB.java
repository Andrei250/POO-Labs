package com.pachetepachete;

public class CalatoriB extends CalatoriA {
    public CalatoriB() {
        super(50, 400);
    }

    @Override
    public void blocareGeamuri() {
        System.out.println("Geamurile se blocheaza automat");
    }
}
