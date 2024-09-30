package patrones_creacionales.abstract_factory.paso3;

import proceso.paso1.Mesilla;
import proceso.paso1.Silla;
import proceso.paso1.Sofa;

public interface FabricaAbstracta {
    Silla crearSilla();
    Sofa crearSofa();
    Mesilla crearMesilla();
}
