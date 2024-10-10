package patrones_estructurales.composite.composite_example;


//Leaf
public class Developer implements Employee{
    private String name;

    public Developer(String name){
        this.name = name;
    }


    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer: " + name);
    }
}
