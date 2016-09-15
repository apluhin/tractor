package ru.sbt.test.refactoring.field;

public enum Orientation {

    NORTH {
        public void moveForward(Position position) {
            position.upY();
        }

        @Override
        public Orientation turn() {
            return EAST;
        }

    }, WEST {
        public void moveForward(Position position) {
            position.downX();
        }

        @Override
        public Orientation turn() {
            return NORTH;
        }
    }, SOUTH {
        public void moveForward(Position position) {
            position.downY();
        }

        @Override
        public Orientation turn() {
            return WEST;
        }
    }, EAST {
        public void moveForward(Position position) {
            position.upX();
        }

        @Override
        public Orientation turn() {
            return SOUTH;
        }
    };

    public abstract void moveForward(Position position);

    public abstract Orientation turn();


}
