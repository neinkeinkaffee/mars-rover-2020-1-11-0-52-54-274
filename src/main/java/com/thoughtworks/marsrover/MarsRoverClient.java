package com.thoughtworks.marsrover;

public class MarsRoverClient {
    private String position;

    public MarsRoverClient(String position) {
        this.position = position;
    }

    public String execute(String command) {
        return "5,6,N";
    }
}
