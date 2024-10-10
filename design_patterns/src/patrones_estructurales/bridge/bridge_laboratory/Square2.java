package patrones_estructurales.bridge.bridge_laboratory;

public class Square2 extends Shape2 {

    private double side;

    public Square2(Color2 color, double side){
        super(color);
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Dibujando un cuadrado de lado: " + side + " de color: ");
        color2.applyColor();
    }
}
