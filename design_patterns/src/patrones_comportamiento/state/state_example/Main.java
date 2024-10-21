package patrones_comportamiento.state.state_example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State stateA = new StateA();
        context.setState(stateA);

        context.applyAction(); // Ejecutar acción en State A (cambia a State B)
        context.applyAction(); // Ejecutar acción en State B (cambia a State C)
        context.applyAction(); // Ejecutar acción en State C (cambia a State A)
    }
}
