package com.pachetepachete;

import java.io.File;
import java.io.FileNotFoundException;

public class TestVisitor {
    public static void main(String[] args) throws FileNotFoundException {
        File fisier = new File("./src/com/pachetepachete");

        File[] objects = fisier.listFiles();
        Director director = new Director("./src/com/pachetepachete");
        Cat cat = new Cat();

        assert objects != null;
        for (File file : objects) {
            director.addChild(new Fisier("./src/com/pachetepachete/" + file.getName()));
        }

        ((Fisier)director.getChildren().get(0)).accept(cat);
    }
}
