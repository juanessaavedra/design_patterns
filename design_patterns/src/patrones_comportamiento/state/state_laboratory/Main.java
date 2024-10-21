package patrones_comportamiento.state.state_laboratory;

public class Main {
    public static void main(String[] args) {
        PlayerContext context = new PlayerContext();

        IState playingState = new PlayingState();
        context.setState(playingState);

        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");

        context.addObserver(observer1);
        context.addObserver(observer2);

        context.applyAction(); // Player is playing
        context.applyAction(); // Player is paused
        context.applyAction(); // Player is stopped
    }
}
