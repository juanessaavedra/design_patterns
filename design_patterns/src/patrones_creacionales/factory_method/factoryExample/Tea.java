package patrones_creacionales.factory_method.factoryExample;

public class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparing tea");
    }
}
