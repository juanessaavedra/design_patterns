package patrones_creacionales.prototype.prototype_presentation;

import java.util.ArrayList;
import java.util.List;

public class Car implements Prototype {
    private String brand;
    private String color;
    private int numberOfDoors;
    private List<String> accessories;

    public Car(String brand, String color, int numberOfDoors){
        this.brand = brand;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.accessories = new ArrayList<>();
    }




    @Override
    public Prototype shallowClone() throws CloneNotSupportedException {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Prototype deepClone() throws CloneNotSupportedException {
        Car clonedCar = new Car(brand, color, numberOfDoors);
        clonedCar.accessories = new ArrayList<>(accessories);
        return clonedCar;
    }

    public void addAccessory(String accessory){
        this.accessories.add(accessory);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", accessories=" + accessories +
                '}';
    }
}
