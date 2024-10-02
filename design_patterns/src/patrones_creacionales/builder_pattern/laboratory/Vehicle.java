package patrones_creacionales.builder_pattern.laboratory;

public class Vehicle {
    private String type;
    private int numberWheels;
    private String color;
    private String model;

    public Vehicle(String type, int numberWheels, String color, String model) {
        this.type = type;
        this.numberWheels = numberWheels;
        this.color = color;
        this.model = model;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", numberWheels=" + numberWheels +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
