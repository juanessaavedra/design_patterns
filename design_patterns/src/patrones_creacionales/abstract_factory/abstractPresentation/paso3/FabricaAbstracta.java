package patrones_creacionales.abstract_factory.abstractPresentation.paso3;

import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Mesilla;
import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Silla;
import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Sofa;


public interface FabricaAbstracta {
    Silla crearSilla();
    Sofa crearSofa();
    Mesilla crearMesilla();
}
