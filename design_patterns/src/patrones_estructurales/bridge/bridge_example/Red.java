package patrones_estructurales.bridge.bridge_example;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
