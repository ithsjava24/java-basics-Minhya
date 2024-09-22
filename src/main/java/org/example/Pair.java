package org.example;

public class Pair implements Comparable<Pair> {
    String tid;
    int pris;

    public Pair(String tid, int pris) {
        this.tid = tid;
        this.pris = pris;
    }

    public String toString() {
        return tid + " " + pris;
    }

    @Override
    public int compareTo(Pair a) {
        return this.pris - a.pris;
    }
}

