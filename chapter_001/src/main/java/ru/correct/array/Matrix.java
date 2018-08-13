package ru.correct.array;

/**
 * @author Aleksei Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @version $
 * @since 0.1
 */

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = table[i][j];
                value = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
