package patrones_comportamiento.state.state_example;

// Estado concreto
public class StateA implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("El estado actual es A");
        context.setState(new StateB()); // Cambiar al siguiente estado
    }

}
