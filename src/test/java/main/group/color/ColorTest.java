package main.group.color;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {
    @Test
    public void testDefaultConstructor() {
        Color color = new Color();
        assertEquals(0, color.red(), "Wartość `red` powinna wynosić 0");
        assertEquals(0, color.green(), "Wartość `green` powinna wynosić 0");
        assertEquals(0, color.blue(), "Wartość `blue` powinna wynosić 0");
        assertEquals(0, color.alpha(), "Wartość `alpha` powinna wynosić 0");
    }
    @Test
    public void testRGBConstructor() {
        Color color = new Color(100, 150, 200);
        assertEquals(100, color.red(), "Wartość `red` powinna wynosić 100");
        assertEquals(150, color.green(), "Wartość `green` powinna wynosić 150");
        assertEquals(200, color.blue(), "Wartość `blue` powinna wynosić 200");
        assertEquals(0, color.alpha(), "Wartość `alpha` powinna wynosić 0");
    }
    @Test
    public void testRGBAConstructor() {
        Color color = new Color(50, 60, 70, 80);
        assertEquals(50, color.red(), "Wartość `red` powinna wynosić 50");
        assertEquals(60, color.green(), "Wartość `green` powinna wynosić 60");
        assertEquals(70, color.blue(), "Wartość `blue` powinna wynosić 70");
        assertEquals(80, color.alpha(), "Wartość `alpha` powinna wynosić 80");
    }
    @Test
    public void testInvalidColorNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Color(-10, 100, 100, 100);
        }, "Konstruktor powinien rzucić wyjątek, jeśli `red` jest poniżej 0");
    }
    @Test
    public void testInvalidColorAboveMaxValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Color(256, 100, 100, 100);
        }, "Konstruktor powinien rzucić wyjątek, jeśli `red` przekracza 255");
    }
    @Test
    public void testGetColor() {
        Color color = new Color(100, 150, 200, 50);
        String expected = "Color[red=100.0, green=150.0, blue=200.0, alpha=50.0]";
        assertEquals(expected, color.getColor(), "Reprezentacja tekstowa koloru powinna być zgodna");
    }
    @Test
    public void testEquals() {
        Color color1 = new Color(100, 150, 200, 50);
        Color color2 = new Color(100, 150, 200, 50);
        assertTrue(color1.equals(color2), "Obiekty `color1` i `color2` powinny być równe");
    }
    @Test
    public void testHashCode() {
        Color color1 = new Color(100, 150, 200, 50);
        Color color2 = new Color(100, 150, 200, 50);
        assertEquals(color1.hashCode(), color2.hashCode(), "Obiekty `color1` i `color2` powinny mieć ten sam hash code");
    }
    @Test
    public void testMaxValues() {
        Color color = new Color(255, 255, 255, 255);
        assertEquals(255, color.red(), "Wartość `red` powinna wynosić 255");
        assertEquals(255, color.green(), "Wartość `green` powinna wynosić 255");
        assertEquals(255, color.blue(), "Wartość `blue` powinna wynosić 255");
        assertEquals(255, color.alpha(), "Wartość `alpha` powinna wynosić 255");
    }
    @Test
    public void testMinValues() {
        Color color = new Color(0, 0, 0, 0);
        assertEquals(0, color.red(), "Wartość `red` powinna wynosić 0");
        assertEquals(0, color.green(), "Wartość `green` powinna wynosić 0");
        assertEquals(0, color.blue(), "Wartość `blue` powinna wynosić 0");
        assertEquals(0, color.alpha(), "Wartość `alpha` powinna wynosić 0");
    }
}