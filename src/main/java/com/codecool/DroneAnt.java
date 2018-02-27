package com.codecool;

public class DroneAnt extends Ant {

    public DroneAnt(int x, int y) {
        super(x, y);
    }

    public void move() {
        if (x == 0 && y == 0) {
            return;
        }
        if (x > 0) {
            x -= 1;
            return;
        } else if (x < 0) {
            x += 1;
            return;
        }

        if (y > 0) {
            y -= 1;
            return;
        } else if (y < 0) {
            y += 1;
            return;
        }
    }
}
