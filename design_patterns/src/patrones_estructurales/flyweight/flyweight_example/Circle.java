package patrones_estructurales.flyweight.flyweight_example;

public class Circle implements Flyweight{
    private String color; // Estado intrínseco (compartido)
    public Circle(String color){
        this.color = color;
    }


    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing circle with color " + color + " at (" + x + ", " + y + ") with radius " + radius);
    }
}
