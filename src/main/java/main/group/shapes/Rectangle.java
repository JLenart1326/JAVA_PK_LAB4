package main.group.shapes;
import main.group.color.Color;
import jakarta.persistence.*;

@Entity
@Table ( name ="rectangles")
public class Rectangle extends ShapeExt {
    // Pola (właściwości klasy)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column ( name ="a")
    float a;

    @Column ( name ="b")
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
    public Long getId() {
        return id;
    }
    public double getWidth() {
        return a;
    }

    public void setWidth(float width) {
        this.a = width;
    }

    public double getHeight() {
        return b;
    }

    public void setHeight(float height) {
        this.b = height;
    }
}
