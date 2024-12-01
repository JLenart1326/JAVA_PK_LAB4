package main.group.shapes;
import main.group.color.Color;

public abstract class ShapeExt {
    Color color;

    public ShapeExt() {
        this.color = new Color();
    }
    public ShapeExt(Color color) {
        this.color = color;
    }

    //Metody wirtualne
    public float getArea(){return 0;};
    public float getPerimeter(){return 0;};
    public void getColorDescription(){ color.print();};
    public String getShapeColor(){ return color.getColor();};
}