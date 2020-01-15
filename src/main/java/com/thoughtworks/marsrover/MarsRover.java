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

    public void turnRight() {
        switch (this.direction) {
            case "N": {
                this.direction = "E";
                break;
            }
            case "E": {
                this.direction = "S";
                break;
            }
            case "S": {
                this.direction = "W";
                break;
            }
            case "W": {
                this.direction = "N";
                break;
            }
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case "N": {
                this.direction = "W";
                break;
            }
            case "E": {
                this.direction = "N";
                break;
            }
            case "S": {
                this.direction = "E";
                break;
            }
            case "W": {
                this.direction = "S";
                break;
            }
        }
    }

    public void moveForward() {
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
    }

    @Override
    public String toString() {
        return String.join(",", String.valueOf(this.x), String.valueOf(this.y), this.direction);
    }
}
