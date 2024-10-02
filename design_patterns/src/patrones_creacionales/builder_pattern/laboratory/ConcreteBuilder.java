package patrones_creacionales.builder_pattern.laboratory;

import patrones_creacionales.builder_pattern.laboratory.Vehicle;
import patrones_creacionales.builder_pattern.laboratory.VehicleBuilder;

public class ConcreteBuilder implements VehicleBuilder {


    private String type;
    private int numberWheels;
    private String color;
    private String model;
    @Override
    public VehicleBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public VehicleBuilder setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
        return this;
    }

    @Override
    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public VehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Vehicle build() {
        return new Vehicle(type, numberWheels, color, model);
    }
}
