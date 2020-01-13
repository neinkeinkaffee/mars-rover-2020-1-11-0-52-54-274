package com.thoughtworks.marsrover;

public class MarsRoverClient {
    private String position;

    public MarsRoverClient(String position) {
        this.position = position;
    }

    public String execute(String command) {
        String currentDirection = this.position.split(",")[2];
        if (command.equals("R")) {
            return "5,5,E";
        }
        switch(currentDirection) {
            case "S": {
                return "5,4,S";
            }
            case "E": {
                return "6,5,E";
            }
            case "W": {
                return "4,5,W";
            }
        }
        return "5,6,N";
    }
}
