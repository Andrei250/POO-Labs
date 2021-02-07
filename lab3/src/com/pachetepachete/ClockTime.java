package com.pachetepachete;

public class ClockTime {
    int hour;
    int minute;

    public ClockTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    int compare(ClockTime x) {
        return this.hour * 60 + this.minute - x.hour * 60 - x.minute;
    }
}
