package turtleApp;

import static turtleApp.Direction.*;

public class Turtle {
    private Pen pen = new Pen();

    private Direction currentDirection = EAST;

    private turtleApp.Position currentPosition = new turtleApp.Position(0, 0);

    public void penUp() {
        pen.penUp();
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }

    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }

    public Position getCurrentPosition() {
       return currentPosition;
    }

    public void move(int numberOfSteps) {
        switch (currentDirection){
            case EAST -> currentPosition
                    .setColumn(currentPosition.getColumn()
                            + numberOfSteps);
        }
    }
}
