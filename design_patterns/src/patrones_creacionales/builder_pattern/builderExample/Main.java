package patrones_creacionales.builder_pattern.builderExample;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ConcreteComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        //Build a gaming computer
        Computer gamingComputer = director.buildGamingComputer();
        System.out.println(gamingComputer);

        //Build a office computer
        Computer officeComputer = director.buildOfficeComputer();
        System.out.println(officeComputer);

    }
}
