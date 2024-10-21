package patrones_comportamiento.template_method.template_laboratory;

public class SaladPreparation extends FoodPreparationTemplate {
    @Override
    protected void gatherIngredients() {
        System.out.println("Gathering vegetables for salad");
    }

    @Override
    protected void cook() {
        System.out.println("Chopping the vegetables");
    }
}
