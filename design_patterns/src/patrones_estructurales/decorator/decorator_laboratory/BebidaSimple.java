package patrones_estructurales.decorator.decorator_laboratory;

public class BebidaSimple implements Bebida{
    @Override
    public String obtenerDescripcion() {
        return "Bevida simple";
    }

    @Override
    public double costo() {
        return 1.0;
    }
}
