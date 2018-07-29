package ru.correct.max;

/**
 * @author Aleksey Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @version &Id$
 * @since 0.1
 */

public class Max {
    public int max(int first, int second) {
        int count = first > second ? first : second;
        return count;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = this.max(temp, third);
        return temp;
    }
}
