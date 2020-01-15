package com.thoughtworks.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverClientTest {
    @Test
    public void shouldMoveOneStepNorthOnMoveCommandWhenFacingNorthAndLocatedIn5_5() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,N");

        String position = marsRoverClient.execute("M");

        assertEquals("5,6,N", position);
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

        assertEquals("6,5,E", position);
    }

    @Test
    public void shouldMoveOneStepWestOnMoveCommandWhenFacingWestAndLocatedIn5_5() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,W");

        String position = marsRoverClient.execute("M");

        assertEquals("4,5,W", position);
    }

    @Test
    public void shouldFaceEastAfterTurnRightCommandWhenFacingNorth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,N");

        String position = marsRoverClient.execute("R");

        assertEquals("5,5,E", position);
    }

    @Test
    public void shouldFaceSouthAfterTurnRightCommandWhenFacingEast() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,E");

        String position = marsRoverClient.execute("R");

        assertEquals("5,5,S", position);
    }

    @Test
    public void shouldFaceWestAfterTurnRightCommandWhenFacingSouth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,S");

        String position = marsRoverClient.execute("R");

        assertEquals("5,5,W", position);
    }

    @Test
    public void shouldFaceNorthAfterTurnRightCommandWhenFacingWest() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,W");

        String position = marsRoverClient.execute("R");

        assertEquals("5,5,N", position);
    }

    @Test
    public void shouldFaceWestAfterTurnLeftCommandWhenFacingNorth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,N");

        String position = marsRoverClient.execute("L");

        assertEquals("5,5,W", position);
    }

    @Test
    public void shouldFaceNorthAfterTurnLeftCommandWhenFacingEast() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,E");

        String position = marsRoverClient.execute("L");

        assertEquals("5,5,N", position);
    }

    @Test
    public void shouldFaceEastAfterTurnLeftCommandWhenFacingSouth() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,S");

        String position = marsRoverClient.execute("L");

        assertEquals("5,5,E", position);
    }

    @Test
    public void shouldFaceSouthAfterTurnLeftCommandWhenFacingWest() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("5,5,W");

        String position = marsRoverClient.execute("L");

        assertEquals("5,5,S", position);
    }

    @Test
    public void shouldMoveOneStepNorthOnMoveCommandWhenFacingNorthAndLocatedIn1_1() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("1,1,N");

        String position = marsRoverClient.execute("M");

        assertEquals("1,2,N", position);
    }

    @Test
    public void shouldMoveOneStepEastOnMoveCommandWhenFacingEastAndLocatedIn1_1() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("1,1,E");

        String position = marsRoverClient.execute("M");

        assertEquals("2,1,E", position);
    }

    @Test
    public void shouldMoveOneStepSouthOnMoveCommandWhenFacingSouthAndLocatedIn1_1() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("1,1,S");

        String position = marsRoverClient.execute("M");

        assertEquals("1,0,S", position);
    }

    @Test
    public void shouldMoveOneStepWestOnMoveCommandWhenFacingWestAndLocatedIn1_1() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("1,1,W");

        String position = marsRoverClient.execute("M");

        assertEquals("0,1,W", position);
    }

    @Test
    public void shouldFaceWestOnTurnLeftCommandWhenFacingNorthAndLocatedIn1_1() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("1,1,N");

        String position = marsRoverClient.execute("L");

        assertEquals("1,1,W", position);
    }

    @Test
    public void shouldFaceEastOnTurnRightCommandWhenFacingNorthAndLocatedIn1_1() {
        MarsRoverClient marsRoverClient = new MarsRoverClient("1,1,N");

        String position = marsRoverClient.execute("R");

        assertEquals("1,1,E", position);
    }
}