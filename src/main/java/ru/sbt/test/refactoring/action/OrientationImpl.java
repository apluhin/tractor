package ru.sbt.test.refactoring.action;

public enum OrientationImpl implements Orientation {

    NORTH {
        public void moveForward(Position position) {
            position.upY();
        }

        @Override
        public OrientationImpl turn() {
            return EAST;
        }

    }, WEST {
        public void moveForward(Position position) {
            position.downX();
        }

        @Override
        public OrientationImpl turn() {
            return NORTH;
        }
    }, SOUTH {
        public void moveForward(Position position) {
            position.downY();
        }

        @Override
        public OrientationImpl turn() {
            return WEST;
        }
    }, EAST {
        public void moveForward(Position position) {
            position.upX();
        }

        @Override
        public OrientationImpl turn() {
            return SOUTH;
        }
    };


}
