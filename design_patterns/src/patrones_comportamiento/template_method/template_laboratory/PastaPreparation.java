package patrones_comportamiento.template_method.template_laboratory;

public class PastaPreparation extends FoodPreparationTemplate {
    @Override
    protected void gatherIngredients() {
        System.out.println("Gathering ingredients for Pasta");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking the Pasta");
    }
}
