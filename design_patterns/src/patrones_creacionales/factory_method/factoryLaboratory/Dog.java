package patrones_creacionales.factory_method.factoryLaboratory;

public class Dog implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Guau guau");
    }
}
