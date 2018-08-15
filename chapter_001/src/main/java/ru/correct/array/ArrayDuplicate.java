package ru.correct.array;

import java.util.Arrays;

/**
 * @author Aleksei Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @version 1$
 * @since 0.1
 */
// This class must clean all duplicates from an array.

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        String temp;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    length--;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }
}