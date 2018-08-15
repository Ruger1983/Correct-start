package ru.correct.array;

/**
 * @author Aleksei Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @version 1$
 * @since 0.1
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i == j) {
                    boolean temp = data[i][j];
                    if (!temp) {
                        result = false;
                    }
                }
                if (j == data.length - i - 1) {
                    boolean temp2 = data[i][j];
                    if (!temp2) {
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}