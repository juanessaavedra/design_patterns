package patrones_comportamiento.interpreter.interpreter_laboratory;


//Expresion no terminal para la suma
public class AddExpression implements AbstractExpression{

    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public AddExpression(AbstractExpression leftExpression, AbstractExpression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }


    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
