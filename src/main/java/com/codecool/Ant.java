package com.codecool;

public abstract class Ant {

    protected int x, y;

    public Ant(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDistance() {
        return Math.abs(x) + Math.abs(y);
    }

    public abstract void move();

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ "{" +
                "x=" + x +
                ", y=" + y +
                ", distance=" + getDistance() +
                '}';
    }
}
