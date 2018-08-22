package ru.correct.testsafter;

/**
 * @author Aleksei Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @since 27.07.2018
 * Test of knowledge class - It will found the condition under which the cut 'AB' is crossing with the cut 'CD'
 */

public class PointsOnLine {

    public boolean isResult(int a, int b, int c, int d) {

        boolean result = false;

        if (a < b && c < d && a < d && b > c) {
            result = true;
        }
        return result;
    }
}