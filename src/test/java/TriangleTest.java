
import org.example.classes.Triangle;
import org.example.classes.enums.TriangleType;
import org.example.classes.exceptions.TirangleTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    public void shouldCalculateAreaUnderZero() {
        Triangle triangle = new Triangle("A", TriangleType.RightTriangle, -1, 4);
        assertEquals(triangle.Area(), 0.0, 0.01);
    }

    @Test
    public void shouldCalculateArea() {
        Triangle triangle = new Triangle("A", TriangleType.RightTriangle, 4, 4);
        assertEquals(triangle.Area(), 8.0, 0.01);
    }

    @Test
    public void shouldCalculatePerimeterEquilateralTriangle() throws TirangleTypeException {
        Triangle triangle = new Triangle("A", TriangleType.EquilateralTriangle, 4, 4);
        assertEquals(triangle.Perimeter(), 12.0, 0.01);
    }

}

