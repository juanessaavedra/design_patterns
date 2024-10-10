package patrones_estructurales.composite.composite_example;

//Use composite pattern
public class Main {
    public static void main(String[] args) {

        //Create employees
        Employee developer1 = new Developer("Juan");
        Employee developer2 = new Developer("Pedro");

        //Create manager and add employees
        Manager manager1 = new Manager("Esteban");
        manager1.add(developer1);
        manager1.add(developer2);

        //Create another manager
        Manager manager2 = new Manager("Carlos");
        manager2.add(new Developer("Luis"));

        //Create another higher level manager and add managers
        Manager generalManager = new Manager("Jorge");
        generalManager.add(manager1);
        generalManager.add(manager2);

        generalManager.showEmployeeDetails();

    }
}
