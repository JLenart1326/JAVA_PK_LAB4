package main.group.mainapp;
import java.util.ArrayList;
import java.util.List;
import main.group.shapes.*;
import main.group.color.*;
import main.group.hibernate.*;

import static main.group.shapes.ShapeDescriber.describe;
import static main.group.shapes.ShapeRenderer.render;

public class Main {
    public static void main(String[] args) {

        //Lab1
        Rectangle rect = new Rectangle(new Color(243,15,122,255),4, 6);
        Triangle triangle = new Triangle(new Color(126,231,122,255),6, 6, 6);
        Circle circle = new Circle(new Color(25,13,64,255),12);

        List<ShapeExt> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(rect);
        shapes.add(circle);

        describe(rect);
        describe(triangle);

        rect.getColorDescription();
        triangle.getColorDescription();

        render(rect);
        render(triangle);
        render(shapes);

        //Lab2
        Color color_1 = new Color();
        Color color_2 = new Color(145,255,15);
        Color color_3 = new Color(255,234,25,143);
        //Color color_4 = new Color(453,-14,-34,777);

        color_1.print();
        color_2.print();
        color_3.print();

    }
}