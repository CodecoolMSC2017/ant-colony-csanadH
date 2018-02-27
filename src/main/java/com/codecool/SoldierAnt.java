package com.codecool;

public class SoldierAnt extends Ant {

    private int stepCount;

    public SoldierAnt(int x, int y) {
        super(x, y);
    }

    public void move() {
        switch (stepCount) {
            case 0:
                x += 1;
                stepCount++;
                break;
            case 1:
                y += 1;
                stepCount++;
                break;
            case 2:
                x -= 1;
                stepCount++;
                break;
            case 3:
                y -= 1;
                stepCount++;
                break;
        }
        if (stepCount == 4) {
            stepCount = 0;
        }
    }
}
