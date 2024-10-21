package patrones_comportamiento.template_method.template_laboratory;

public abstract class FoodPreparationTemplate {

    private CookingStrategy cookingStrategy;

    public void setCookingStrategy(CookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }
    public void prepareFood() {
        gatherIngredients();
        cook();
        serve();
    }

    protected abstract void gatherIngredients();
    protected void cook(){
        if (cookingStrategy != null) {
            cookingStrategy.cook();
        } else {
            System.out.println("No cooking strategy defined");
        }
    };
    protected void serve() {
        System.out.println("Serving the food");
    }
}
