package patrones_estructurales.bridge.bridge_example;

public abstract class Shape {
    protected Color color;

    protected Shape(Color color){
        this.color = color;
    }

    abstract void draw();
}
