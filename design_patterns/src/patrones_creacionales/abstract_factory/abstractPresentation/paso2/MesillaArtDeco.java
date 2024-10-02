package patrones_creacionales.abstract_factory.abstractPresentation.paso2;

import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Mesilla;


public class MesillaArtDeco implements Mesilla {
    @Override
    public void ponerCosas() {
        System.out.println("Pones cosas en una mesilla ArtDecó.");
    }
}
