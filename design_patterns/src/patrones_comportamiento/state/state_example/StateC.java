package patrones_comportamiento.state.state_example;

public class StateC implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("El estado actual es C");
        context.setState(new StateA()); // Cambiar al siguiente estado
    }
}
