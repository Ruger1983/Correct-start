package ru.correct.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int i = 1;
        for (int index : rst) {
            rst[index] = i * i;
            i++;
        }
        return rst;
    }
}
