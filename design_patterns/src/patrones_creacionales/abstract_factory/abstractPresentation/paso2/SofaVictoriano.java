package patrones_creacionales.abstract_factory.abstractPresentation.paso2;

import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Sofa;


public class SofaVictoriano implements Sofa {
    @Override
    public void tumbarse() {
        System.out.println("Te tumbas en un sofá victoriano.");
    }
}
