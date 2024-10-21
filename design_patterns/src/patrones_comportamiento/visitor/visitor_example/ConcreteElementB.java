package patrones_comportamiento.visitor.visitor_example;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("Operation B");
    }
}
