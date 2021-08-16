package com.everymatrix.ships.service;

public class ShipsCounter {

    public static Integer countShips(int[][] ships) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < ships.length; i++) {
            for (int k = 0; k < ships[i].length; k++) {
                if (ships[i][k] == 1) {
                    index = 1;
                    ships[i][k] = 2;
                    //Проверка на участки массива типа 1 1
                    //                                 1 1
                    // Насколько я понял, это всё должно определяться, как одинарные кораблики
                    // Если закомментировать, то будет определять как 2 двухпалубных корабля типа 1 1
                    if (
                            i < 9 && k < 9 && ships[i + 1][k] != 0 && ships[i][k + 1] != 0 ||
                                    i < 9 && k > 0 && ships[i + 1][k] != 0 && ships[i][k - 1] != 0 ||
                                    i > 0 && k < 9 && ships[i - 1][k] != 0 && ships[i][k + 1] != 0 ||
                                    i > 0 && k > 0 && ships[i - 1][k] != 0 && ships[i][k - 1] != 0
                    ) {
                        count++;
                        continue;
                    }
                    // Проверка на то, есть ли палубы справа от найденной части корабля
                    while (k + index < ships[i].length && ships[i][k + index] == 1) {
                        ships[i][k + index] = 2;
                        index++;
                        if (k + index == 9) {
                            ships[i][k + index] = 2;
                            break;
                        }
                    }
                    // Проверка на то, есть ли палубы снизу от найденной части корабля
                    while (i + index < ships.length && ships[i + index][k] == 1) {
                        ships[i + index][k] = 2;
                        index++;
                        if (i + index == 9) {
                            ships[i + index][k] = 2;
                            break;
                        }
                    }
                    count++;
                }
            }
        }
        System.out.println("Count of ships = " + count);
        return count;

    }

}
