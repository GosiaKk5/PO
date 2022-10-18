package agh.ics.oop;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MapDirectionTest {
    @Test
    void northNext(){
        assertEquals(MapDirection.NORTH.next(), MapDirection.EAST);
    }
    @Test
    void eastNext(){
        assertEquals(MapDirection.EAST.next(), MapDirection.SOUTH);
    }
    @Test
    void southNext(){
        assertEquals(MapDirection.SOUTH.next(), MapDirection.WEST);
    }
    @Test
    void westNext(){
        assertEquals(MapDirection.WEST.next(), MapDirection.NORTH);
    }

}
