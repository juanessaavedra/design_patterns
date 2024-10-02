package patrones_creacionales.abstract_factory.paso2;

import patrones_creacionales.abstract_factory.paso1.Mesilla;


public class MesillaModerna implements Mesilla {
    @Override
    public void ponerCosas() {
        System.out.println("Pones cosas en una mesilla moderna.");
    }
}
