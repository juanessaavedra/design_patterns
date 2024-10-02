package patrones_creacionales.builder_pattern.laboratory;

public interface VehicleBuilder {



    VehicleBuilder setType(String tpye);

    VehicleBuilder setNumberWheels(int numberWheels);

    VehicleBuilder setColor(String color);

    VehicleBuilder setModel(String model);
    Vehicle build();

}
