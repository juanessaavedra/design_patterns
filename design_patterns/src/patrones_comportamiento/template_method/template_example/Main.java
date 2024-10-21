package patrones_comportamiento.template_method.template_example;

//Clase principal
public class Main {
    public static void main(String[] args) {
        Template templateA = new ConcreteClassA();
        templateA.execute(); // Ejecuta el algoritmo de la clase A

        System.out.println();

        Template templateB = new ConcreteClassB();
        templateB.execute(); // Ejecuta el algoritmo de la clase B

    }
}
