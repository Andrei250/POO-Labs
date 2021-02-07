package com.pachetepachete;

public class Prob1 {
    public static void main(String[] args) {
        IceCream vanilla = new Vanilla(new Chocolate(new BasicIceCream()));
        System.out.println(vanilla.getDescription());
        System.out.println("Ingrediente: " + vanilla.getIng());
        System.out.println(vanilla.getCost());
    }
}
