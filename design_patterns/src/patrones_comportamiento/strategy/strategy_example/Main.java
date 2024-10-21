package patrones_comportamiento.strategy.strategy_example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AdditionStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5)); // Suma

        context.setStrategy(new SubtractionStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5)); // Resta

        context.setStrategy(new MultiplicationStrategy());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5)); // Multiplicación

        context.setStrategy(new DivisionStrategy());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5)); // División, maneja las divisiones por cero
    }

}

