package ru.correct.tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * @author Aleksei Aizenberg (mailto:aleksvld1983@yandex.ru)
 * @version 1$
 * @since 0.1
 */

public class Figure3T extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    public Figure3T() {
    }

    public Figure3T(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }
}

