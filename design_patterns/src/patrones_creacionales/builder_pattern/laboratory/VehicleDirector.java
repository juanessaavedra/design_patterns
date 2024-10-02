package patrones_creacionales.builder_pattern.laboratory;

import patrones_creacionales.builder_pattern.laboratory.Vehicle;
import patrones_creacionales.builder_pattern.laboratory.VehicleBuilder;

public class VehicleDirector {
    private VehicleBuilder builder;

    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    public Vehicle sportVehicle() {
        return builder.setType("Sport").setNumberWheels(4).setColor("Red").setModel("Sport").build();
    }
}
