package patrones_estructurales.bridge.bridge_devices;

public interface Device { // Deine los metodos que las clases concretas como (TV Y RADIO) implementaran
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);
}
