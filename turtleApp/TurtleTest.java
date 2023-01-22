package turtleApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleApp.Direction.*;

public class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void startAllTestWith(){
        ijapa  = new Turtle();
    }

    @Test
    public void turtleExistTest(){
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUpTest(){
        Turtle ijapa = new Turtle();
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }


    @Test
    public void turtleCanTurnRightWhileFAcingEastTest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingWestTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingNorthTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test

    public void turtleCanTurnLeftWhileFacingEastTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test

    public void turtleCanTurnLeftWhileFacingNorthTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test

    public void turtleCanTurnLeftWhileFacingWestTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test

    public void turtleCanTurnLeftWhileFacingSouthTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    public void turtleCanMoveForwardWhileFacingEast(){
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());

        ijapa.move( 5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());

    }

}


