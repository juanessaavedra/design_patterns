package patrones_estructurales.adapter.adapter_laboratory;

public class Main {
    public static void main(String[] args) {

        //Example

        Adaptee adaptee = new Adaptee();
        //Adaptador que envuelva al adaptee
        Target target = new Adapter(adaptee);
        //Usar el adaptador
        target.request();


        //Laboratory
        NewService newService = new NewService();
        Target target2 = new NewServiceAdapter(newService);
        target2.request();
    }
}
