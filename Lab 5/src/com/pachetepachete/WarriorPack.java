package com.pachetepachete;

/**
 * 
 */
import java.util.*;

public class WarriorPack {
    private Vector warriors ;

    public WarriorPack () {
        warriors = new Vector();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors ;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
            if (warriors.get(i).getClass() == Snake.class) {
                //Snake does 10 damage
                damage += ((Snake)warriors.get(i)).getDamage();
            } else if (warriors.get(i).getClass() == Ogre.class) {
                //Ogre does 6 damage
                damage += ((Ogre)warriors.get(i)).getDamage();
            } else if (warriors.get(i).getClass() == MarshmallowMan.class) {
                //Marshmallow Man does 1 damage
                damage += ((MarshmallowMan)warriors.get(i)).getDamage();
            }
        }
        return damage;
    }

    @Override
    public String toString() {
        return "WarriorPack{" +
                "warriors=" + warriors +
                "}\n";
    }

    public static void main(String[] args) {
        Warrior war1 = new Snake(1050, "DA");
        Warrior war2 = new Ogre(1050, "DA");
        Warrior war3 = new MarshmallowMan(1050, "DA");
        Warrior war4 = new Snake(1050, "DA");
        Warrior war5 = new Ogre(1050, "DA");
        Warrior war6 = new MarshmallowMan(1050, "DA");
        Warrior war7 = new Snake(1050, "DA");

        WarriorPack pkg = new WarriorPack();

        pkg.addWarrior(war1);
        pkg.addWarrior(war2);
        pkg.addWarrior(war3);
        pkg.addWarrior(war3);
        pkg.addWarrior(war4);
        pkg.addWarrior(war5);
        pkg.addWarrior(war6);
        pkg.addWarrior(war7);

        System.out.println(pkg.calculateDamage());
        System.out.println(pkg.toString());

    }
}
