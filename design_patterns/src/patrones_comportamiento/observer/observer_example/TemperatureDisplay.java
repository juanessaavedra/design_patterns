package patrones_comportamiento.observer.observer_example;


//Clase concreta del observer
public class TemperatureDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("La temperatura es: " + temperature);
    }
}
