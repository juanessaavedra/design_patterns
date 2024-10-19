# Interpreter
Patron de diseño que define una gramática para interpretar un lenguaje y proporciona un intérprete para ejecutar el código.

## Cuando usarlo
- Cuando se necesita intereptar un lenguaje o expresion que puede cambiar
- Cuando un lenguaje puede ser descrito mediante una gramatica sencilla

## Componentes del patron
1. Context: Informacion que es necesaria para interpe
2. AbstractExpression: Define la interfaz para interpretar los elementos del lenguaje
3. TerminalExpression: Implementa la interfaz AbstractExpression (hojas de la gramatica)
4. NonTerminalExpression: Implementa la interfaz AbstractExpression (nodos de la gramatica)

## Conclusion
- Elpatron interpreter permite construir un interprete para un lenguanje especifico de manera estructura
- Es ideal para lenguajes simples, donde la gramatica es sencilla

