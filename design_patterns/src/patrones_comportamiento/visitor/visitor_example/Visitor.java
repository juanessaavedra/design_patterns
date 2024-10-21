package patrones_comportamiento.visitor.visitor_example;

public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);

    void visit(ConcreteElementC elementC);
}
