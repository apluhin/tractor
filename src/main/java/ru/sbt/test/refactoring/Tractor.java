package ru.sbt.test.refactoring;


import ru.sbt.test.refactoring.action.*;

public class Tractor {

	private final Position position;
	private final Field field;

	public Tractor(Position position, Field field) {
		this.position = position;
		this.field = field;
	}

	public Tractor() {
		position = new Position(0, 0, OrientationEnum.NORTH);
		field = new Field(5,5);
	}

	public void move(String command) {
		new Command(command).execute(position, field);
	}

    public void moveForwards() {
    	position.changePosition(field);
	}

    public void turnClockwise() {
		position.turnOrient();
	}

	public int getPositionX() {
		return position.getX();
	}

	public int getPositionY() {
		return position.getY();
	}

	public Orientation getOrientation() {
		return position.getOrientation();
	}


}
