package patrones_creacionales.factory_method.factoryLaboratory;

public class CatFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Cat();
    }
}
