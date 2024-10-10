package patrones_estructurales.bridge.bridge_laboratory;

public class Main {
    public static void main(String[] args) {
        Shape2 redCircle = new Circle2(10,new Red2());
        Shape2 blueSquare = new Square2(new Blue2(), 10);
        Shape2 greenTriangle = new Triangle(new Green(), 5, 10);


        redCircle.draw();
        blueSquare.draw();
        greenTriangle.draw();
    }
}
