package patrones_comportamiento.template_method.template_example;

public class ConcreteClassB extends Template {
    @Override
    protected void step1() {
        System.out.println("Step 1: ConcreteClassB");
    }

    @Override
    protected void step2() {
        System.out.println("Step 2: ConcreteClassB");
    }
}
