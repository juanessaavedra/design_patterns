package patrones_creacionales.abstract_factory.paso4;


import patrones_creacionales.abstract_factory.paso1.Mesilla;
import patrones_creacionales.abstract_factory.paso1.Silla;
import patrones_creacionales.abstract_factory.paso1.Sofa;
import patrones_creacionales.abstract_factory.paso2.MesillaVictoriana;
import patrones_creacionales.abstract_factory.paso2.SillaVictoriana;
import patrones_creacionales.abstract_factory.paso2.SofaVictoriano;
import patrones_creacionales.abstract_factory.paso3.FabricaAbstracta;

public class FabricaVictoriana implements FabricaAbstracta {
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Sofa
    crearSofa() {
        return new SofaVictoriano();
    }

    @Override
    public Mesilla crearMesilla() {
        return new MesillaVictoriana();
    }
}
