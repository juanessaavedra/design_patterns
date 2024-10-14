package patrones_comportamiento.command.command_laboratory;

public class RemoteControlTv {
    private ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
