package patrones_comportamiento.state.laboratory;

public class PlayerContext {
    private IState state;


        public void setState(IState state) {
            this.state = state;
        }

        public void applyAction() {
            state.doAction(this);
        }
}
