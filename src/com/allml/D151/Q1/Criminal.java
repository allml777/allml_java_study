package com.allml.D151.Q1;

public class Criminal {
    private int location;
    private int number;

    public Criminal() {
    }

    public Criminal(int location, int number) {
        this.location = location;
        this.number = number;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Criminal{" +
                "location=" + location +
                ", number=" + number +
                '}';
    }
}
