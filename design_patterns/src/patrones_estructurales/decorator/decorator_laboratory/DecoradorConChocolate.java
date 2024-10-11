package patrones_estructurales.decorator.decorator_laboratory;

public class DecoradorConChocolate extends DecoradorBebida {
    public DecoradorConChocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + " con chocolate";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.70;
    }
}
