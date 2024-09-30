package patrones_creacionales.abstract_factory.paso2;

import proceso.paso1.Mesilla;

public class MesillaArtDeco implements Mesilla {
    @Override
    public void ponerCosas() {
        System.out.println("Pones cosas en una mesilla ArtDecó.");
    }
}
