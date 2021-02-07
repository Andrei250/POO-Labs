package com.pachetepachete;

public class Schedule {
    ClockTime departure;
    ClockTime arrival;

    public Schedule(int startHour, int stopHour, int startMinute, int stopMinute) {
        this.departure = new ClockTime(startHour, startMinute);
        this.arrival = new ClockTime(stopHour, stopMinute);
    }

    int duration() {
        return Math.abs(arrival.compare(departure));
    }
}
