package patrones_creacionales.factory_method.factoryExample;

public class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing coffee");
    }
}
