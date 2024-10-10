package patrones_estructurales.bridge.bridge_devices;

import java.rmi.Remote;

public class Main {
    public static void main(String[] args) {

        //TV
        Device tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);

        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();

        //Radio
        Device radio = new Radio();
        AdvancedRemotControl advancedRemote = new AdvancedRemotControl(radio);
        advancedRemote.togglePower();
        advancedRemote.mute();
    }
}
