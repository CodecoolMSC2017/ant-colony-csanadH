package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Ant> antList = new ArrayList<>();
        antList.add(new QueenAnt(0, 0));
        antList.add(new SoldierAnt(50, 20));
        antList.add(new SoldierAnt(10, -20));
        antList.add(new WorkerAnt(-10, 23));
        antList.add(new DroneAnt(50, 50));

        while (scan.nextLine().equals("")) {
            for (Ant ant : antList) {
                ant.move();
                System.out.println(ant.toString());
            }
        }
    }
}
