package patrones_comportamiento.state.state_example;
// Crear el contexto
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void applyAction() {
        state.doAction(this);
    }
}
