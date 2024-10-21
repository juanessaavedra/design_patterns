package patrones_comportamiento.visitor.visitor_example;

public interface Element {
    void accept(Visitor visitor);
    String getName();
}
