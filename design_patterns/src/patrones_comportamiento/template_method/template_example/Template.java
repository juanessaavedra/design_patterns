package patrones_comportamiento.template_method.template_example;


//Clase abstracta
public abstract class Template {
    //metodo template
    public void execute() {
        step1();
        step2();
        step3();
        step4();
    }

    //Pasos que deben ser implementados por las subclases
    protected abstract void step1();
    protected abstract void step2();
    protected  void step3(){
        System.out.println("Step 3: Completing the process");
    };

    protected void step4(){}
}
