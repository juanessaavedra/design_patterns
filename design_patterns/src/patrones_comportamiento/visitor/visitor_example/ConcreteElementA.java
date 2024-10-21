package patrones_comportamiento.visitor.visitor_example;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "ConcreteElementA";
    }

    public void operationA() {
        System.out.println("Operation A");
    }
}
