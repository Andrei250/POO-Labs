package com.pachetepachete;

public class MarshmallowMan extends Warrior{
    public MarshmallowMan() {
        this(0, "Gusti");
    }

    public MarshmallowMan(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return 1;
    }
}
