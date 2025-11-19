import org.example.classes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    public void shouldCalculateAreaUnderZero() {
        Square square = new Square("A", -1);
        assertEquals(square.Area(), 0.0, 0.01);
    }

    @Test
    public void shouldCalculateArea() {
        Square square = new Square("A", 2);
        assertEquals(square.Area(), 4.0, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Square square = new Square("A", 5);
        assertEquals(square.Perimeter(), 20.0, 0.01);
    }

}




