package com.pachetepachete;

public class Chocolate extends ToppingDecorator {
    public Chocolate(IceCream tempIceCream) {
        super(tempIceCream);
    }

    public String getDescription() {
        return super.getDescription() + "\n" + "Se adauga ciocolata";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getIng() {
        return super.getIng() + " ciocolata";
    }
}
