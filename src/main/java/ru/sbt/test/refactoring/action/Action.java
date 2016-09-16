package ru.sbt.test.refactoring.action;

enum Action {
    MOVE {
        public void execute(Position position, Field field) {
            position.changePosition(field);
        }
    },
    TURN {
        public void execute(Position position, Field field) {
            position.turnOrient();
        }
    };

    public abstract void execute(Position position, Field field);

}
