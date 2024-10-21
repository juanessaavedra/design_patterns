package patrones_comportamiento.state.state_laboratory;

public class StoppedState implements IState {
    @Override
    public void doAction(PlayerContext context) {
        System.out.println("Player is stopped");
        context.setState(new PlayingState());
    }
}
