package patrones_creacionales.abstract_factory.paso4;


import patrones_creacionales.abstract_factory.paso1.Mesilla;
import patrones_creacionales.abstract_factory.paso1.Silla;
import patrones_creacionales.abstract_factory.paso1.Sofa;
import patrones_creacionales.abstract_factory.paso2.MesillaModerna;
import patrones_creacionales.abstract_factory.paso2.SillaArtDeco;
import patrones_creacionales.abstract_factory.paso2.SofaModerno;
import patrones_creacionales.abstract_factory.paso3.FabricaAbstracta;

public class FabricaArtDeco implements FabricaAbstracta {
    @Override
    public Silla crearSilla() {
        return new SillaArtDeco();
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
