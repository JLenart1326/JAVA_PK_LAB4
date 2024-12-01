package main.group.shapes;

import java.awt.*;
import java.util.List;

public class ShapeRenderer {
    private ShapeRenderer() {};
    public static void render(ShapeExt shape) {
        System.out.println("RENDER" + shape.getShapeColor());
    }
    public static void render(List<ShapeExt> shapes) {
        for(ShapeExt shape : shapes) {
            System.out.println("RENDER" + shape.getShapeColor());
        }
    }
}
