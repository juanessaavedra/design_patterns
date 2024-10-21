package patrones_comportamiento.template_method.template_laboratory;

public class Main {
    public static void main(String[] args) {
        FoodPreparationTemplate salad = new SaladPreparation();
        salad.prepareFood();

        System.out.println();

        FoodPreparationTemplate pasta = new PastaPreparation();
        pasta.prepareFood();
    }
}
