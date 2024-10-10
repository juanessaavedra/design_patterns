package patrones_estructurales.bridge.bridge_laboratory;

public class Circle2 extends Shape2 {
    private double radius;

    public Circle2(double radius, Color2 color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un círculo de radio: " + radius + " de color: ");
        color2.applyColor();
    }
}
