package ru.correct.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index : data) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
