package patrones_estructurales.bridge.bridge_example;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
        color.applyColor();
    }
}
