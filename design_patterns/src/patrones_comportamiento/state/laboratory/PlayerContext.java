package patrones_comportamiento.state.laboratory;


import java.util.ArrayList;
import java.util.List;

// Modificacion para manejar observadores
public class PlayerContext {
    private IState state;
    private List<Observer> observers = new ArrayList<>();


        public void setState(IState state) {
            this.state = state;
            notifyObservers();
        }

        public void applyAction() {
            state.doAction(this);
        }

        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(state.getClass().getSimpleName());
            }
        }
}
