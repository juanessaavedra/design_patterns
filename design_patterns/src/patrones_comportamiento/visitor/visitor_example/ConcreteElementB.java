package patrones_comportamiento.visitor.visitor_example;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "ConcreteElementB";
    }

    public void operationB() {
        System.out.println("Operation B");
    }
}
