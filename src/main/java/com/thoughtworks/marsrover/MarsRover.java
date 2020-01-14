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
                this.y += 1;
                break;
            }
            case "S": {
                this.y -= 1;
                break;
            }
            case "E": {
                this.x += 1;
                break;
            }
            case "W": {
                this.x -= 1;
                break;
            }
        }
        return this.toString();
    }

    @Override
    public String toString() {
        return String.join(",", String.valueOf(this.x), String.valueOf(this.y), this.direction);
    }
}
