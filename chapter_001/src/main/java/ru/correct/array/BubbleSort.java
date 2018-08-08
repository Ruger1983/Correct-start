package ru.correct.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        boolean result = false;
        int temp;
        while (!result) {
            result = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    result = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}

