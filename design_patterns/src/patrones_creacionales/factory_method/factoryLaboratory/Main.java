package patrones_creacionales.factory_method.factoryLaboratory;

public class Main {
    public static void main(String[] args) {

        // Dog factory
        PetFactory petFactory = new DogFactory();
        Pet dog = petFactory.createPet();
        dog.makeSound();

        // Cat factory
        PetFactory catFactory = new CatFactory();;
        Pet cat = catFactory.createPet();
        cat.makeSound();
    }
}
