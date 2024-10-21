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
        Visitor anotherVisitor = new AnotherVisitor();

        System.out.println("Using ConcreteVisitor:");
        for (Element element : elements) {
            element.accept(visitor); // The visitor visits each element
        }

        System.out.println("\nUsing AnotherVisitor:");
        for (Element element : elements) {
            element.accept(anotherVisitor); // The anotherVisitor visits each element
        }
    }
    }

