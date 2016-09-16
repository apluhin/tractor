package ru.sbt.test.refactoring.action;

import java.util.HashMap;
import java.util.Map;

import static ru.sbt.test.refactoring.action.Action.MOVE;
import static ru.sbt.test.refactoring.action.Action.TURN;

public class Command {

    private final Action action;
    private final Map<String, Action> commands;


    public Command(String command) {
        this.commands = new HashMap<>();
        initialize();
        this.action = commands.get(command);
    }

    public Command(String command, Map<String, Action> commands) {
        this.action = commands.get(command);
        this.commands = commands;
    }

    private void initialize() {
        commands.put("T", TURN);
        commands.put("F", MOVE);
    }

    public void execute(Position position, Field field) {
        action.execute(position, field);
    }


}
