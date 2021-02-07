package com.pachetepachete;

class Test00 {
    public static void main(String[] args) {
        SortedVector v1=new SortedVector(new Comp1());
        SortedVector v2=new SortedVector(new Comp2());
        v1.add(new Pair("x",1));
        v1.add(new Pair("a",3));
        v2.add(new Pair("a",3));
        v2.add(new Pair("x",1));
        System.out.println(v1);
        System.out.println(v2);
    }
}