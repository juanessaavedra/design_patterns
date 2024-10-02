package patrones_creacionales.abstract_factory.abstractPresentation.paso4;

import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Mesilla;
import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Silla;
import patrones_creacionales.abstract_factory.abstractPresentation.paso1.Sofa;
import patrones_creacionales.abstract_factory.abstractPresentation.paso2.MesillaModerna;
import patrones_creacionales.abstract_factory.abstractPresentation.paso2.SillaModerna;
import patrones_creacionales.abstract_factory.abstractPresentation.paso2.SofaModerno;
import patrones_creacionales.abstract_factory.abstractPresentation.paso3.FabricaAbstracta;


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
