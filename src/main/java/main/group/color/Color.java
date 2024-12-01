package main.group.color;

public record Color(float red, float green, float blue, float alpha) {
    public Color {
        if(red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255 || alpha < 0 || alpha > 255){
            throw new IllegalArgumentException("Invalid color");
        };
    }
    public Color() {
        this(0,0,0,0);
    }
    public Color(float red, float green, float blue) {
        this(red,green,blue,0);
    }
    public void print(){
        System.out.println("Red: " + red + " Green: " + green + " Blue: " + blue + " Alpha: " + alpha);
    }
    public String getColor(){
        return this.toString();
    }

}
