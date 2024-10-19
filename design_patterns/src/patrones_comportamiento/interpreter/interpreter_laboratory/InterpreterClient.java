package patrones_comportamiento.interpreter.interpreter_laboratory;

public class InterpreterClient {
    public static void main(String[] args) {

        //Crear el contexto
        Context context = new Context();

        //Crear la expresion (5+3) * 2/2
        AbstractExpression expression = new DivisionExpression(
                new MultiplyExpression(
                        new AddExpression(
                                new NumberExpression(5),
                                new NumberExpression(3)
                        ),
                        new NumberExpression(2)
                ),
                new NumberExpression(2)
        );

        //Interpretar la expresion
        int result = expression.interpret(context);
        System.out.println("Resultado: " + result); // Output: 8
    }
}
