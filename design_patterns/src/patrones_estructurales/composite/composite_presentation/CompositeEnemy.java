package patrones_estructurales.composite.composite_presentation;

import java.util.ArrayList;
import java.util.List;

public class CompositeEnemy implements Entity{
    private List<Entity> parts = new ArrayList<>();

    public void add(Entity part){
        parts.add(part);
    }

    public void remove(Entity part){
        parts.remove(part);
    }


    @Override
    public void render() {
        System.out.println("Render CompositeEnemy");
        for(Entity part : parts){
            part.render();
        }
    }
}
