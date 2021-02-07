package com.pachetepachete;

public class Fisier {
    String name;
    double dimension;
    String modified_at;
    boolean isDir;

    public Fisier(String name, double dimension, String modified_at, boolean isDir) {
        this.name = name;
        this.dimension = dimension;
        this.modified_at = modified_at;
        this.isDir = isDir;
    }
}
