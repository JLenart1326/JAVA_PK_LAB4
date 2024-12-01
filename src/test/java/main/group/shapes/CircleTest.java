package main.group.shapes;
import main.group. color.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testArea() {
        Circle circle = new Circle(new Color(255,255,255,255), 4.0f);
        assertEquals((float)(16.0f * Math.PI), circle.getArea(), "Pole koła powinno wynosić 16PI");
    }
    @Test
    public void testPerimeter() {
        Circle circle = new Circle(new Color(255,255,255,255), 4.0f);
        assertEquals((float)(8.0f*Math.PI), circle.getPerimeter(), "Obwód koła powinien wynosić 8PI");
    }
    @Test
    public void testConstructorWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(new Color(255,255,255,255), -4.0f );
        }, "Konstruktor powinien rzucić wyjątek dla ujemnej szerokości");
    }
}
