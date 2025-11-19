import org.example.classes.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    public void shouldCalculateArea() {
        Circle circle = new Circle("A", -1);
        assertEquals(circle.Area(), 0.0, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Circle circle = new Circle("A", 1);
        assertEquals(circle.Perimeter(), 6.28, 0.01);
    }

}
