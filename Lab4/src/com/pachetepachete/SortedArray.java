package com.pachetepachete;

public class SortedArray extends Array {
    public SortedArray() {
        super();
    }

    @Override
    public void addElement(Integer x) {
        super.addElement(x);
        super.sort();
    }
}
