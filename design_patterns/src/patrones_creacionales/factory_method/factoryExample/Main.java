package patrones_creacionales.factory_method.factoryExample;

public class Main {
    public static void main(String[] args) {
        //Creamos una fabrica para cafe
        BeverageFactory coffeeFactory = new CoffeeFactory();
        Beverage coffee = coffeeFactory.createBeverage(); //Creamos un cafe
        coffee.prepare(); //Preparamos el cafe

        //Creamos una fabrica para te
        BeverageFactory teaFactory = new TeaFactory();
        Beverage tea = teaFactory.createBeverage(); //Creamos un te
        tea.prepare(); //Preparamos el te
    }
}
