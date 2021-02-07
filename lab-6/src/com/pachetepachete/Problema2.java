package com.pachetepachete;

public class Problema2 {

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Rectangle obj2 = new Square();

        Square patr = new Square();

        if (patr instanceof Rectangle) {
            Rectangle rect = (Rectangle) patr;
        }

        if (patr instanceof Shape) {
            Shape abs = (Shape) patr;
        }

        //Conversie 1
        Circle c1 = new Circle();
        Square sq;
        //Conversie 2
        Rectangle r = new Square(5.0);
        sq = (Square) r;

        System.out.println(sq.getSide());
        //Conversie 3
        sq = new Square(7.0);
        r = sq;
    }
}
