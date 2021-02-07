package com.pachetepachete;

import java.util.*;
class SortedVector extends Vector{
    Comparator c;
    public SortedVector(Comparator c){
        this.c=c;
    }
    /*public SortedVector(){
    this(null);
    } */
    public boolean add(Object o){
        super.add(o);
        Collections.sort(this,c);
        return true;
    }

}

class Comp1 implements Comparator{
    public int compare(Object o1, Object o2){
        Pair p1=(Pair)o1;
        Pair p2=(Pair)o2;
        return ((Comparable)(p1.a)).compareTo(p2.a);
    }
}
class Comp2 implements Comparator{
    public int compare(Object o1, Object o2){
        Pair p1=(Pair)o1;
        Pair p2=(Pair)o2;
        return ((Comparable)(p1.b)).compareTo(p2.b);
    }
}