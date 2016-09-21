package ru.sbt.test.refactoring.action;

enum Action {

    MOVE("F") {
        public void execute(Position position, Field field) {
            position.changePosition(field);
        }
    },
    TURN("T") {
        public void execute(Position position, Field field) {
            position.turnOrient();
        }
    };

    private final String symbol;

    Action(String t) {this.symbol = t;}

    public abstract void execute(Position position, Field field);

    public String getSymbol() {return symbol;}
}
