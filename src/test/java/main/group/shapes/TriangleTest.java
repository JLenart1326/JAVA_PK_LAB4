package main.group.shapes;
import main.group.color.Color;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    public void testArea() {
        Triangle triangle = new Triangle(new Color(126,231,122,255),6, 6, 6);
        assertEquals(15.588457f, triangle.getArea(), "Pole trójkąta powinno wynosić 15.588457");
    }
    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(new Color(126,231,122,255),6, 6, 6);
        assertEquals(18.0f, triangle.getPerimeter(), "Obwód trójkąta powinno wynosić 18.0");
    }
    @Test
    public void testConstructorWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(new Color(255,255,255,255), -6.0f, 6.0f, -6.0f);
        }, "Konstruktor powinien rzucić wyjątek dla ujemnej szerokości");
    }
    @Test
    public void testTriangleAreaValidation() {
        Triangle triangle = new Triangle(new Color(255,255,255,255), 1.0f, 2.0f, 5.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            triangle.getArea();
        }, "Konstruktor powinien rzucić wyjątek dla ujemnej szerokości");
    }
    @Test
    public void testTrianglePerimeterValidation() {
        Triangle triangle = new Triangle(new Color(255,255,255,255), 1.0f, 2.0f, 5.0f);
        assertThrows(IllegalArgumentException.class, () -> {
            triangle.getPerimeter();
        }, "Konstruktor powinien rzucić wyjątek dla ujemnej szerokości");
    }
}
