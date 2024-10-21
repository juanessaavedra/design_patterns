package patrones_comportamiento.strategy.strategy_example;

// Crear el contexto
public class Context {
    private Strategy strategy;;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.execute(num1, num2);
    }
}
