package visitor2;

public class TarjetaNormal extends Tarjeta {

    @Override
    public double aceptar(Visitor visitor) {
        return visitor.visit(this);
    }
}
