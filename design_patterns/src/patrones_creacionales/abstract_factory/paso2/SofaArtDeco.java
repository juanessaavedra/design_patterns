package patrones_creacionales.abstract_factory.paso2;

import proceso.paso1.Sofa;

public class SofaArtDeco implements Sofa {
    @Override
    public void tumbarse() {
        System.out.println("Te tumbas en un sofá ArtDecó.");
    }
}
