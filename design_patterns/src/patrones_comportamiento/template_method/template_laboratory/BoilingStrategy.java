package patrones_comportamiento.template_method.template_laboratory;

public class BoilingStrategy implements CookingStrategy {
    @Override
    public void cook() {
        System.out.println("Boiling the ingredients");
    }
}
