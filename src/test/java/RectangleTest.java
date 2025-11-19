import org.example.classes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void shouldCalculateAreaUnderZero() {
        Rectangle rectangle = new Rectangle("A", -1, -1);
        assertEquals(rectangle.Area(), 0.0, 0.01);
    }

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle("A", 2, 4);
        assertEquals(rectangle.Area(), 8.0, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("A", 1, 5);
        assertEquals(rectangle.Perimeter(), 10.0, 0.01);
    }

}

