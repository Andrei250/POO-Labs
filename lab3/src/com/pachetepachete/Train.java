package com.pachetepachete;

public class Train {
    Route r;
    Schedule s;
    boolean local;

    public Train(boolean local, String start, String stop, int startHour, int startMinute, int stopHour, int stopMinute) {
        this.r = new Route(start, stop);
        this.s = new Schedule(startHour, stopHour, startMinute, stopMinute);
        this.local = local;
    }

    int calcPrice() {
        return local ? s.duration() : s.duration() * 2;
    }

    public static void main(String[] args) {
        Train A = new Train(true, "Bucuresti Nord", "Constanta" , 9, 35, 12, 2);
        Train B = new Train(true, "Bucuresti Nord", "Ias" , 5, 45, 12, 49);
        Train C = new Train(false, "Bucuresti Nord", "Sofia" , 23, 45, 17, 0);

        System.out.println(A.calcPrice());
        System.out.println(C.calcPrice());
        System.out.println(A.r.tur_retur(B.r));
    }

}
