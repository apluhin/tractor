package ru.sbt.test.refactoring.field;

public class Field {
    private final int maxX;
    private final int maxY;


    public Field(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;

    }

    int getMaxX() {
        return maxX;
    }

    int getMaxY() {
        return maxY;
    }
}
