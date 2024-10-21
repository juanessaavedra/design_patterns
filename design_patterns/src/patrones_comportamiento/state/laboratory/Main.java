package patrones_comportamiento.state.laboratory;

public class Main {
    public static void main(String[] args) {
        PlayerContext context = new PlayerContext();

        IState playingState = new PlayingState();
        context.setState(playingState);

        context.applyAction(); // Player is playing
        context.applyAction(); // Player is paused
        context.applyAction(); // Player is stopped
    }
}
