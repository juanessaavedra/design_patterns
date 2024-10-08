package patrones_creacionales.prototype.prototype_presentation;

public class MainCar {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car originalCar = new Car("Toyota", "Red", 4);
        originalCar.addAccessory("Air conditioning");
        originalCar.addAccessory("Electric windows");

        //Shallow clone

        Car shallowClonedCar = (Car) originalCar.shallowClone();
        shallowClonedCar.setColor("Blue");

        //Deep clone
        Car deepClonedCar = (Car) originalCar.deepClone();
        deepClonedCar.setColor("Green");
        deepClonedCar.addAccessory("Radio");

        originalCar.addAccessory("CD player");

        System.out.println("Original car: " + originalCar);
        System.out.println("Shallow cloned car: " + shallowClonedCar);
        System.out.println("Deep cloned car: " + deepClonedCar);

    }
}
