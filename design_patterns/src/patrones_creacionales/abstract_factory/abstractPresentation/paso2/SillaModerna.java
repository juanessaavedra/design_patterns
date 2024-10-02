package patrones_creacionales.abstract_factory.abstractPresentation.paso2;

import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Silla;


public class SillaModerna implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Te sientas en una silla moderna.");
    }
}