package visitor2;

public class Descuento implements Visitor {

    private final double descuentoNormal = 0.8;
    private final double descuentoPeferencial = 0.5;

    @Override
    public double visit(TarjetaNormal tarjetaNormal) {
        return tarjetaNormal.getPrecio() * descuentoNormal;
    }

    @Override
    public double visit(TarjetaPreferencial tarjetaPreferencial) {
        return tarjetaPreferencial.getPrecio() * descuentoPeferencial;
    }
}
