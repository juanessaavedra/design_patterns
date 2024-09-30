package patrones_estructurales.abstract_factory.paso2;

import proceso.paso1.Silla;

public class SillaVictoriana implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Te sientas en una silla victoriana.");
    }
}
