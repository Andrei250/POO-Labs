package com.pachetepachete;

public abstract class ToppingDecorator implements IceCream {
    IceCream tempIceCream;

    public ToppingDecorator(IceCream tempIceCream) {
        this.tempIceCream = tempIceCream;
    }

    @Override
    public String getDescription() {
        return tempIceCream.getDescription();
    }

    @Override
    public double getCost() {
        return tempIceCream.getCost();
    }

    @Override
    public String getIng() {
        return tempIceCream.getIng();
    }
}
