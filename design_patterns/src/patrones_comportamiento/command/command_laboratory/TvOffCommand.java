package patrones_comportamiento.command.command_laboratory;

public class TvOffCommand implements ICommand {
    private Tv tv;

    public TvOffCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
