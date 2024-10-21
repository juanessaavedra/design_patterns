package patrones_comportamiento.state.state_laboratory;

public class PlayingState implements IState {
    @Override
    public void doAction(PlayerContext context) {
        System.out.println("Player is playing");
        context.setState(new PausedState());
    }
}
