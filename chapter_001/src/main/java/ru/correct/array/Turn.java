package ru.correct.array;

public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array.length - temp - 1;
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}