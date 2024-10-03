package patrones_creacionales.factory_method.factoryExample;

public class TeaFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Tea();
    }
}
