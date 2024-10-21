package patrones_comportamiento.state.state_laboratory;

public class PausedState implements IState {
    @Override
    public void doAction(PlayerContext context) {
        System.out.println("Player is paused");
        context.setState(new StoppedState());
    }
}