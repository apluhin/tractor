package ru.sbt.test.refactoring.action;

public enum OrientationEnum implements Orientation {

    NORTH {
        public void moveForward(Position position) {
            position.upY();
        }

        @Override
        public OrientationEnum turn() {
            return EAST;
        }

    }, WEST {
        public void moveForward(Position position) {
            position.downX();
        }

        @Override
        public OrientationEnum turn() {
            return NORTH;
        }
    }, SOUTH {
        public void moveForward(Position position) {
            position.downY();
        }

        @Override
        public OrientationEnum turn() {
            return WEST;
        }
    }, EAST {
        public void moveForward(Position position) {
            position.upX();
        }

        @Override
        public OrientationEnum turn() {
            return SOUTH;
        }
    };




}
