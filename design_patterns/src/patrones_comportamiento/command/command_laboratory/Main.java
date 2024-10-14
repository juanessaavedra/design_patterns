package patrones_comportamiento.command.command_laboratory;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControlTv remoteControl = new RemoteControlTv();
        ICommand tvOnCommand = new TvOnCommand(tv);
        ICommand tvOffCommand = new TvOffCommand(tv);

        remoteControl.setCommand(tvOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(tvOffCommand);
        remoteControl.pressButton();
    }
}
