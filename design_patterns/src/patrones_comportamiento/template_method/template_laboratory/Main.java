package patrones_comportamiento.template_method.template_laboratory;

public class Main {
    public static void main(String[] args) {
        FoodPreparationTemplate pastaPreparation = new PastaPreparation();

        // Set the cooking strategy to boiling
        pastaPreparation.setCookingStrategy(new BoilingStrategy());
        pastaPreparation.prepareFood();

        // Change the cooking strategy to grilling
        pastaPreparation.setCookingStrategy(new GrillingStrategy());
        pastaPreparation.prepareFood();
    }
}
