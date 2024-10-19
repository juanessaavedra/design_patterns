package patrones_comportamiento.interpreter.interpreter_laboratory;

public class MultiplyExpression implements AbstractExpression{

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public MultiplyExpression(AbstractExpression leftExpression, AbstractExpression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }


    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
