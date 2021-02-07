package com.pachetepachete;

public class Route {
    String origin;
    String destination;

    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    boolean tur_retur(Route r) {
        return (this.origin.equals(r.destination) && this.destination.equals(r.origin));
    }
}
