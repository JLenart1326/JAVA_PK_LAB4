package main.group.shapes;
import main.group.color.Color;



public class Circle extends ShapeExt {
    // Pola (właściwości klasy)
    float r;

    // Konstruktor (służy do tworzenia obiektów klasy)
    public Circle(Color color, float r) {
        this.color = color;
        if(r < 0){
            throw new IllegalArgumentException("Ujemny parametr!");
        }
        else{
            this.r = r;
        }
    }
    public Circle() {
        this.r = 0;
        this.color = new Color();
    }

    // Metoda (czynność, którą klasa może wykonać)
    @Override
    public float getArea(){
        return (float) (Math.PI * Math.pow(this.r, 2));

    };
    @Override
    public float getPerimeter(){
        return (float) (2 * Math.PI * this.r);
    };
}
