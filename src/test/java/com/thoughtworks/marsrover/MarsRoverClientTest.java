package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverClientTest {
    @Test
    public void shouldMoveOneStepNorthOnMoveCommandWhenFacingNorthAndLocatedIn5_5() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,N");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "5,6,N");
    }

    @Test
    public void shouldMoveOneStepSouthOnMoveCommandWhenFacingSouthAndLocatedIn5_5() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,S");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "5,4,S");
    }

    @Test
    public void shouldMoveOneStepEastOnMoveCommandWhenFacingEastAndLocatedIn5_5() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,E");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "6,5,E");
    }

    @Test
    public void shouldMoveOneStepWestOnMoveCommandWhenFacingWestAndLocatedIn5_5() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,W");

        String position = marsRoverClient.execute("M");

        assertEquals(position, "4,5,W");
    }

    @Test
    public void shouldFaceEastAfterTurnRightCommandWhenFacingNorth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,N");

        String position = marsRoverClient.execute("R");

        assertEquals(position, "5,5,E");
    }

    @Test
    public void shouldFaceSouthAfterTurnRightCommandWhenFacingEast() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,E");

        String position = marsRoverClient.execute("R");

        assertEquals(position, "5,5,S");
    }

    @Test
    public void shouldFaceWestAfterTurnRightCommandWhenFacingSouth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,S");

        String position = marsRoverClient.execute("R");

        assertEquals(position, "5,5,W");
    }

    @Test
    public void shouldFaceNorthAfterTurnRightCommandWhenFacingWest() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,W");

        String position = marsRoverClient.execute("R");

        assertEquals(position, "5,5,N");
    }

    @Test
    public void shouldFaceWestAfterTurnLeftCommandWhenFacingNorth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,N");

        String position = marsRoverClient.execute("L");

        assertEquals(position, "5,5,W");
    }

    @Test
    public void shouldFaceNorthAfterTurnLeftCommandWhenFacingEast() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,E");

        String position = marsRoverClient.execute("L");

        assertEquals(position, "5,5,N");
    }

    @Test
    public void shouldFaceEastAfterTurnLeftCommandWhenFacingSouth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,S");

        String position = marsRoverClient.execute("L");

        assertEquals(position, "5,5,E");
    }

    @Test
    public void shouldFaceSouthAfterTurnLeftCommandWhenFacingWest() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,W");

        String position = marsRoverClient.execute("L");

        assertEquals(position, "5,5,S");
    }
}