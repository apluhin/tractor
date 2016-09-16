package ru.sbt.test.refactoring.action;

public interface Orientation {
    void moveForward(Position position);

    OrientationImpl turn();
}
