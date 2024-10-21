package patrones_comportamiento.visitor.visitor_example;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        elementB.operationB();
    }

    @Override
    public void visit(ConcreteElementC elementC) {
        elementC.operationC();
    }
}
