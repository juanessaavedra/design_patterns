package patrones_creacionales.abstract_factory.paso4;

import proceso.paso1.Mesilla;
import proceso.paso1.Silla;
import proceso.paso1.Sofa;
import proceso.paso2.MesillaModerna;
import proceso.paso2.SillaModerna;
import proceso.paso2.SofaModerno;
import proceso.paso3.FabricaAbstracta;

public class FabricaModerna implements FabricaAbstracta {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }

    @Override
    public Mesilla crearMesilla() {
        return new MesillaModerna();
    }
}
