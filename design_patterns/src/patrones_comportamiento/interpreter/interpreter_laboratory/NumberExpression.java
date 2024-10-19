package patrones_comportamiento.interpreter.interpreter_laboratory;


//expresion terminal para numeros
public class NumberExpression implements AbstractExpression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
