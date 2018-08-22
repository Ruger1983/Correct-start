package ru.correct.testsafter;

/**
 * @author Aleksei Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @since 06.07.2018
 * Test of knowledge class - It will create the sorted array from two sorted arrays.
 */

public class WhenTwoBecomeOne {
    public int[] conc(int[] first, int[] second) {
        int[] third = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                third[k] = first[i];
                i++;
            } else {
                third[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            third[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            third[k] = second[j];
            j++;
            k++;
        }
        return third;
    }
}
