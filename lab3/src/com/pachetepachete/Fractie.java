package com.pachetepachete;

public class Fractie {
    int numarator;
    int numitor;

    public Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public Fractie() {
        this(2, 3);
    }

    public int getNumarator() {
        return numarator;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    public void setNumitor(int numitor) {
        this.numitor = numitor;
    }

    Fractie calculate(Fractie fr2) {
        Fractie ans = new Fractie();

        ans.setNumitor(this.numitor * fr2.numitor);
        ans.setNumarator(this.numarator * fr2.numitor + this.numitor * fr2.numarator);

        return ans;
    }

    @Override
    public String toString() {
        return "Fractie{" +
                "numarator=" + numarator +
                ", numitor=" + numitor +
                '}';
    }


    public boolean equals(Object fr2) {
        if (fr2.getClass() == this.getClass()) {
            return ((Fractie) fr2).numarator * this.numitor == this.numarator * ((Fractie) fr2).numitor;
        }

        return false;
    }

    public static void main(String[] args) {
        Fractie fr1 = new Fractie();
        Fractie fr2 = new Fractie(2, 3);
        Fractie fr3 = new Fractie(4, 5);

        System.out.println(fr1.equals(fr2));
        System.out.println(fr1.equals(fr3));
        System.out.println(fr1.calculate(fr2).toString());
    }
}
