package patrones_comportamiento.visitor.visitor_example;

public class ConcreteElementC implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "ConcreteElementC";
    }

    public void operationC() {
        System.out.println("Operation C");
    }
}
