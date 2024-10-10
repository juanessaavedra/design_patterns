package patrones_estructurales.composite.composite_presentation;

public class PartEnemy implements Entity{
    private String name;

    public PartEnemy(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Render PartEnemy: " + name);
    }
}
