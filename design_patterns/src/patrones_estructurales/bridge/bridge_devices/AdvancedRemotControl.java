package patrones_estructurales.bridge.bridge_devices;

public class AdvancedRemotControl extends RemoteControl{
    public AdvancedRemotControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Mute");
    }
}
