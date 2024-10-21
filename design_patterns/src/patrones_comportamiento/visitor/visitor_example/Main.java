package patrones_comportamiento.visitor.visitor_example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();

        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementB());
        elements.add(new ConcreteElementC());

        Visitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(visitor); //El visitor visita cada elemento
        }
    }
}
