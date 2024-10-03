package patrones_creacionales.factory_method.factoryLaboratory;

public class Cat implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Miau miau");
    }
}
