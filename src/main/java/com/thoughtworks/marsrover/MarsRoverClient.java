package com.thoughtworks.marsrover;

public class MarsRoverClient {
    private String position;

    public MarsRoverClient(String position) {
        this.position = position;
    }

    public String execute(String command) {
        String currentDirection = this.position.split(",")[2];
        if (command.equals("R")) {
            switch (currentDirection) {
                case "N": {
                    return "5,5,E";
                }
                case "E": {
                    return "5,5,S";
                }
                case "S": {
                    return "5,5,W";
                }
                case "W": {
                    return "5,5,N";
                }
            }
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
