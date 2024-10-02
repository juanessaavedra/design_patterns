package patrones_creacionales.builder_pattern.laboratory;

import patrones_creacionales.builder_pattern.laboratory.VehicleBuilder;
import patrones_creacionales.builder_pattern.laboratory.ConcreteBuilder;
import patrones_creacionales.builder_pattern.laboratory.VehicleDirector;

public class Main {
    public static void main(String[] args) {
        VehicleBuilder builder = new ConcreteBuilder();
        VehicleDirector director = new VehicleDirector(builder);
        System.out.println(director.sportVehicle());
    }
}
