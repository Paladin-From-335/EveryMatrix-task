package com.everymatrix.ships;

import static com.everymatrix.ships.service.ShipsCounter.countShips;

public class ShipCounterRun {


    static int[][] ships = {
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 1}
    };

    public static void main(String[] args) {
        countShips(ships);
    }
}
