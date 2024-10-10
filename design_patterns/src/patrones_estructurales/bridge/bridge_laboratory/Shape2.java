package patrones_estructurales.bridge.bridge_laboratory;

import patrones_estructurales.bridge.bridge_example.Color;

public abstract class Shape2 {
    protected Color2 color2;

    protected Shape2(Color2 color2){
        this.color2 = color2;
    }

    abstract void draw();
}
