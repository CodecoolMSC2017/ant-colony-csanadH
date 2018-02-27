package com.codecool;

import java.util.Random;

public class WorkerAnt extends Ant {

    private Random rand = new Random();

    public WorkerAnt(int x, int y) {
        super(x, y);
    }

    public void move() {
        int randStep = rand.nextInt(4);
        switch (randStep) {
            case 0:
                x += 1;
                break;
            case 1:
                x -= 1;
                break;
            case 2:
                y += 1;
                break;
            case 3:
                y -= 1;
                break;
        }
    }
}
