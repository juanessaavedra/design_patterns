package patrones_comportamiento.observer.observer_example;

import java.util.ArrayList;
import java.util.List;

//Clase concreta del subject
public class WeatherStation implements Subject{
    private final List<Observer> observers;
    private float temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    //Cambiar la temperatura y noitificar a los observadores
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
