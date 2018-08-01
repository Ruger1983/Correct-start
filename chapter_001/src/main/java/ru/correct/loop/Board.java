package ru.correct.loop;

public class Board {
    StringBuilder vertical;
    String ln = System.lineSeparator();

    public Board() {
        this.vertical = new StringBuilder();
    }

    public String paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 1) {
                    vertical.append(' ');
                } else {
                    vertical.append('x');
                }
            }
            vertical.append(ln);
        }
        return vertical.toString();
    }
}