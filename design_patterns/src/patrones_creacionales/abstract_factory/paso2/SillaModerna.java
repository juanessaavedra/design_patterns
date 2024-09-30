package patrones_creacionales.abstract_factory.paso2;

import proceso.paso1.Silla;

public class SillaModerna implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Te sientas en una silla moderna.");
    }
}
