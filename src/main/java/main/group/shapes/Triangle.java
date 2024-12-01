package main.group.shapes;
import main.group.color.Color;

public class Triangle extends ShapeExt{
    // Pola (właściwości klasy)
    float a;
    float b;
    float c;

    // Konstruktor (służy do tworzenia obiektów klasy)
    public Triangle(Color color, float a, float b, float c) {
        this.color = color;
        if(a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException("Ujemny parametr!");
        }
        else{
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.color = new Color();
    }

    // Metoda (czynność, którą klasa może wykonać)
    @Override
    public float getArea(){
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Podane długości boków nie tworzą trójkąta");
        }

        double s = (a + b + c) / 2;
        double wynik = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return (float) wynik;
    };
    @Override
    public float getPerimeter(){
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Podane długości boków nie tworzą trójkąta");
        }
        return a+b+c;
    };
}
