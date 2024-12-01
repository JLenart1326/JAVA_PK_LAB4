package main.group.shapes;
import main.group.color.Color;

public class Rectangle extends ShapeExt {
    // Pola (właściwości klasy)
    float a;
    float b;

    // Konstruktor (służy do tworzenia obiektów klasy)
    public Rectangle(Color color, float a, float b) {
        this.color = color;
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Ujemny parametr!");
        }
        else{
            this.a = a;
            this.b = b;
        }
    }
    public Rectangle() {
        this.a = 0;
        this.b = 0;
        this.color = new Color();
    }

    // Metoda (czynność, którą klasa może wykonać)
    @Override
    public float getArea(){
        return a*b;
    };
    @Override
    public float getPerimeter(){
        return 2*a+2*b;
    };
}
