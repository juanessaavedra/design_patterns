package patrones_comportamiento.template_method.template_laboratory;

public class GrillingStrategy implements CookingStrategy {
    @Override
    public void cook() {
        System.out.println("Grilling the ingredients");
    }
}
