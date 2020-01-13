package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverClientTest {
    @Test
    public void shouldMoveOneStepNorthOnMoveCommandWhenFacingNorth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,N");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "5,6,N");
    }

    @Test
    public void shouldMoveOneStepSouthOnMoveCommandWhenFacingSouth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,S");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "5,4,S");
    }

    @Test
    public void shouldMoveOneStepEastOnMoveCommandWhenFacingEast() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,E");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "6,5,E");
    }

    @Test
    public void shouldMoveOneStepWestOnMoveCommandWhenFacingWest() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,W");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "4,5,W");
    }
}