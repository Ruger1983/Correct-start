package ru.correct.array;

/**
 * @author Aleksei Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @version 1$
 * @since 0.1
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean temp3 = true, temp4 = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i == j) {
                    boolean temp = data[i][j];
                    if (!temp) {
                        result = false;
                    }
                    temp3 = temp;
                }
                if (j == data.length - i) {
                    boolean temp2 = data[i][j];
                    if (!temp2) {
                        result = false;
                    }
                    temp4 = temp2;
                }
            }
        }
        if (data.length % 2 != 0) {
            if (temp3 != temp4) {
                result = false;
            }
        }
        return result;
    }
}