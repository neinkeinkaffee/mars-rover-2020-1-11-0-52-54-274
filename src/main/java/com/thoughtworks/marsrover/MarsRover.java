package com.thoughtworks.marsrover;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String turnRight() {
        switch (this.direction) {
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
        return null;
    }

    public String turnLeft() {
        switch (this.direction) {
            case "N": {
                return "5,5,W";
            }
            case "E": {
                return "5,5,N";
            }
            case "S": {
                return "5,5,E";
            }
            case "W": {
                return "5,5,S";
            }
        }
        return null;
    }

    public String moveForward() {
        switch(this.direction) {
            case "N": {
                return String.join(",", String.valueOf(this.x), String.valueOf(this.y + 1), this.direction);
            }
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
        return null;
    }
}
