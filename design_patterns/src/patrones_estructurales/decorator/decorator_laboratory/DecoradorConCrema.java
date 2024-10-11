package patrones_estructurales.decorator.decorator_laboratory;

public class DecoradorConCrema extends DecoradorBebida {
    public DecoradorConCrema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + " con crema";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.5;
    }
}
