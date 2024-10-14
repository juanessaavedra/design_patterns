package patrones_comportamiento.command.command_example;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffComand(light);

        RemoteControl remoteControl = new RemoteControl();

        //Turn on the light
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        //Turn off the light
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
