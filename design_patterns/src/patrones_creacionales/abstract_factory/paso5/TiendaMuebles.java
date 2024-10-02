package patrones_creacionales.abstract_factory.paso5;


import patrones_creacionales.abstract_factory.paso1.Mesilla;
import patrones_creacionales.abstract_factory.paso1.Silla;
import patrones_creacionales.abstract_factory.paso1.Sofa;
import patrones_creacionales.abstract_factory.paso3.FabricaAbstracta;
import patrones_creacionales.abstract_factory.paso4.FabricaModerna;
import patrones_creacionales.abstract_factory.paso4.FabricaVictoriana;

public class TiendaMuebles {
    private Silla silla;
    private Sofa sofa;
    private Mesilla mesilla;

    // El cliente selecciona la fábrica en función del estilo que desea.
    public TiendaMuebles(FabricaAbstracta fabrica) {
        this.silla = fabrica.crearSilla();
        this.sofa = fabrica.crearSofa();
        this.mesilla = fabrica.crearMesilla();
    }

    public void usarMuebles() {
        silla.sentarse();
        sofa.tumbarse();
        mesilla.ponerCosas();
    }

    public static void main(String[] args) {
        // El cliente elige un estilo de muebles (por ejemplo, moderno).
        FabricaAbstracta fabricaModerna = new FabricaModerna();
        TiendaMuebles tienda = new TiendaMuebles(fabricaModerna);
        tienda.usarMuebles();

        // Si el cliente quiere cambiar a muebles victorianos:
        FabricaAbstracta fabricaVictoriana = new FabricaVictoriana();
        tienda = new TiendaMuebles(fabricaVictoriana);
        tienda.usarMuebles();
    }
}





