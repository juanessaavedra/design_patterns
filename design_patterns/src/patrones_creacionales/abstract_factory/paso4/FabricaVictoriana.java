package patrones_creacionales.abstract_factory.paso4;

import proceso.paso1.Mesilla;
import proceso.paso1.Silla;
import proceso.paso1.Sofa;
import proceso.paso2.MesillaVictoriana;
import proceso.paso2.SillaVictoriana;
import proceso.paso2.SofaVictoriano;
import proceso.paso3.FabricaAbstracta;

public class FabricaVictoriana implements FabricaAbstracta {
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }

    @Override
    public Mesilla crearMesilla() {
        return new MesillaVictoriana();
    }
}
