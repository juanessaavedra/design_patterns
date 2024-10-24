package patrones_comportamiento.visitor.visitor_example;

public class AnotherVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("Another operation on" + concreteElementA.getName());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("Another operation on" + concreteElementB.getName());
    }

    @Override
    public void visit(ConcreteElementC concreteElementC) {
        System.out.println("Another operation on" + concreteElementC.getName());
    }
}
