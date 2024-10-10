package patrones_estructurales.bridge.bridge_example;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
