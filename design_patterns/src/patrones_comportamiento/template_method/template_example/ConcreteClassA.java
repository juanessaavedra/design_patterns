package patrones_comportamiento.template_method.template_example;

//Subclase concreta 1
public class ConcreteClassA extends Template {
    @Override
    protected void step1() {
        System.out.println("Step 1: ConcreteClassA");
    }

    @Override
    protected void step2() {
        System.out.println("Step 2: ConcreteClassA");
    }

    @Override
    protected void step4() {
        System.out.println("Step 4: ConcreteClassA (Optional Step)");
    }
}
