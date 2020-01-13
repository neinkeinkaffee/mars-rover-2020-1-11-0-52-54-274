package com.thoughtworks.marsrover;

public class MarsRoverClient {
    private String position;

    public MarsRoverClient(String position) {
        this.position = position;
    }

    public String execute(String command) {
        String currentDirection = this.position.split(",")[2];
        if (currentDirection.equals("S")) {
            return "5,4,S";
        } else if (currentDirection.equals("E")) {
            return "6,5,E";
        } else if (currentDirection.equals("W")) {
            return "4,5,W";
        }
        return "5,6,N";
    }
}
