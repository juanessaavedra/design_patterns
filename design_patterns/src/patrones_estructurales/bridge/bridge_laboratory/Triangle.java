package patrones_estructurales.bridge.bridge_laboratory;



public class Triangle extends Shape2{

    private double base;
    private double height;

    public Triangle(Color2 color2, double base, double height){
        super(color2);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Dibujando un triángulo de base: " + base + " y altura: " + height + " de color: ");
        color2.applyColor();
    }
}
