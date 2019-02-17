package visitor2;

public interface Visitor {

    double visit (TarjetaNormal tarjetaNormal);
    double visit (TarjetaPreferencial tarjetaPreferencial);
}
