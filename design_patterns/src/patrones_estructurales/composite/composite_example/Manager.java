package patrones_estructurales.composite.composite_example;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Manager implements Employee{
    private String name;
    private List<Employee> team = new ArrayList<>(); //Garantiza que nunca sea null

    public Manager(String name){
        this.name = name;
    }

    public void add(Employee employee){
        team.add(employee);
    }

    public void removeEmployee(Employee employee){
        team.remove(employee);
    }

    public void showEmployeeDetails(){
        System.out.println("Manager: " + name);
        for(Employee employee : team){
            employee.showEmployeeDetails();
        }
    }
}
