package patrones_comportamiento.observer.observer_example;

//Interfaz del Subject
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
