package patrones_comportamiento.visitor.visitor_example;

public class AnotherVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("Another operation on A");
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("Another operation on B");
    }

    @Override
    public void visit(ConcreteElementC concreteElementC) {
        System.out.println("Another operation on C");
    }
}
