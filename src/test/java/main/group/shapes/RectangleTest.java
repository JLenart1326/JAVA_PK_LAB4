package main.group.shapes;
import main.group.color.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(new Color(255,255,255,255), 4.0f, 5.0f);
        assertEquals(20.0, rectangle.getArea(), "Pole prostokąta powinien wynosić 20.0");
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(new Color(255,255,255,255), 4.0f, 5.0f);
        assertEquals(18.0, rectangle.getPerimeter(), "Obwód prostokąta powinien wynosić 18.0");
    }
    @Test
    public void testConstructorWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(new Color(255,255,255,255), -4.0f, 5.0f);
        }, "Konstruktor powinien rzucić wyjątek dla ujemnej szerokości");
    }
}