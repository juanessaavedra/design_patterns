package patrones_estructurales.bridge.bridge_devices;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 20;
    private int channel = 88;


    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Radio is ON");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Radio is OFF");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Volume is set to: " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel is set to: " + channel);
    }
}
