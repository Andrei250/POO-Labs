package com.pachetepachete;

public class Vanilla extends ToppingDecorator{
    public Vanilla(IceCream tempIceCream) {
        super(tempIceCream);
    }

    public String getDescription() {
        return super.getDescription() + "\n" + "Se adauga Vanilie";
    }

    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getIng() {
        return super.getIng() + " vanilie";
    }
}
