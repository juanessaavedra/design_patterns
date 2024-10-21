package patrones_comportamiento.observer.observer_example;

public class TemperatureAlert implements Observer {

    @Override
    public void update(float temperature) {
        if (temperature > 30) {
            System.out.println("Alerta de temperatura: " + temperature);
        }
    }
}
