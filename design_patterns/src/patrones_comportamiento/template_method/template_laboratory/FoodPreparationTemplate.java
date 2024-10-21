package patrones_comportamiento.template_method.template_laboratory;

public abstract class FoodPreparationTemplate {
    public void prepareFood() {
        gatherIngredients();
        cook();
        serve();
    }

    protected abstract void gatherIngredients();
    protected abstract void cook();
    protected void serve() {
        System.out.println("Serving the food");
    }
}
