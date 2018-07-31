package ru.correct.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = sum; start <= finish; start++) {
            if (sum % 2 != 0) {
                continue;
            }
            sum = sum + i;
        }
        return sum;
    }
}
