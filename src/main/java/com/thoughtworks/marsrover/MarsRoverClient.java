package com.thoughtworks.marsrover;

public class MarsRoverClient {
    private final MarsRover marsRover;

    public MarsRoverClient(String position) {
        int x = Integer.valueOf(position.split(",")[0]);
        int y = Integer.valueOf(position.split(",")[1]);
        String direction = position.split(",")[2];
        this.marsRover = new MarsRover(x, y, direction);
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
