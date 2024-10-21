package patrones_comportamiento.observer.observer_example;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        TemperatureAlert temperatureAlert = new TemperatureAlert();

        // Registrar los observadores
        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(temperatureAlert);

        // Cambiar la temperatura
        weatherStation.setTemperature(20);
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(31);
    }
}