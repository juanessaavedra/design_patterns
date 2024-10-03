package patrones_creacionales.factory_method.factoryLaboratory;

public class DogFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Dog();
    }
}
