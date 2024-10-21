package patrones_comportamiento.state.state_example;

public class StateB implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("El estado actual es B");
        context.setState(new StateC()); // Cambiar al siguiente estado
    }
}
