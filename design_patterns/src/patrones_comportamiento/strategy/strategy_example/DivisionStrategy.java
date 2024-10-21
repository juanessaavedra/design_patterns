package patrones_comportamiento.strategy.strategy_example;

public class DivisionStrategy implements Strategy{
    @Override
    public int execute(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return num1 / num2;
    }
}
