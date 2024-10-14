package patrones_comportamiento.command.command_laboratory;

import patrones_comportamiento.command.command_example.Command;

public class Tv implements Command {
    private boolean on;

    public Tv() {
        this.on = false;
    }

    public void turnOn() {
        this.on = true;
        System.out.println("TV is on");
    }

    public void turnOff() {
        this.on = false;
        System.out.println("TV is off");
    }

    @Override
    public void execute() {
        if (this.on) {
            this.turnOff();
        } else {
            this.turnOn();
        }
    }
}
