package patrones_estructurales.abstract_factory.paso2;

import proceso.paso1.Sofa;

public class SofaModerno implements Sofa {
    @Override
    public void tumbarse() {
        System.out.println("Te tumbas en un sofá moderno.");
    }
}
