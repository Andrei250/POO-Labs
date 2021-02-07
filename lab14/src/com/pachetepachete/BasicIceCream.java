package com.pachetepachete;

public class BasicIceCream implements IceCream{
    private double price = 0.5;

    public BasicIceCream() {
        System.out.println("Se adauga o cupa");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Aceasta este o cupa";
    }

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public String getIng() {
        return "Con";
    }
}
