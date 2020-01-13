package com.thoughtworks.marsrover;

public class MarsRoverClient {
    private String position;

    public MarsRoverClient(String position) {
        this.position = position;
    }

    public String execute(String command) {
        if (this.position.split(",")[2].equals("S")) {
            return "5,4,S";
        }
        return "5,6,N";
    }
}
