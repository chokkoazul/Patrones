package visitor2;

public class TarjetaPreferencial extends Tarjeta {

    @Override
    public double aceptar(Visitor visitor) {
        return visitor.visit(this);
    }
}
