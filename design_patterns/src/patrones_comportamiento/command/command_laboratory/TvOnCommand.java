package patrones_comportamiento.command.command_laboratory;

public class TvOnCommand implements ICommand {
    private Tv tv;

    public TvOnCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
