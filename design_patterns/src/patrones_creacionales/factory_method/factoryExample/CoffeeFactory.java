package patrones_creacionales.factory_method.factoryExample;

public class CoffeeFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Coffee();
    }
}
