package com.thoughtworks.marsrover;

public class MarsRoverClient {
    private final MarsRover marsRover;
    private String position;

    public MarsRoverClient(String position) {
        this.position = position;
        String direction = position.split(",")[2];
        this.marsRover = new MarsRover(direction);
    }

    public String execute(String command) {
        if (command.equals("R")) {
            return marsRover.turnRight();
        } else if (command.equals("L")) {
            return marsRover.turnLeft();
        }
        return marsRover.moveForward();
    }
}
