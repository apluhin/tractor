package ru.sbt.test.refactoring.action;

import ru.sbt.test.refactoring.exception.TractorInDitchException;
import ru.sbt.test.refactoring.utils.Util;

public class Position {
    private int x;
    private int y;
    private Orientation orientation;


    public Position(int x, int y, OrientationImpl orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }


    void upX() {
        x++;
    }

    void downX() {
        x--;
    }

    void upY() {
        y++;
    }

    void downY() {
        y--;
    }


    public void changePosition(Field field) {
        orientation.moveForward(this);

        if (!inField(field)) {
            throw new TractorInDitchException();
        }

    }

    public void turnOrient() {
        this.orientation = orientation.turn();
    }

    private boolean inField(Field field) {
        return Util.isBigger(field.getMaxX(), x) && Util.isBigger(field.getMaxY(), y);
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
