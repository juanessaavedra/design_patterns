package patrones_estructurales.bridge.bridge_devices;

public class Tv implements Device{

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;


    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("TV is ON");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("TV is OFF");
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
