package visitor2;

public class Cliente {

    public static void main (String... args){
        Tarjeta tarjetaNormal = new TarjetaNormal();
        Tarjeta tarjetaPreferencial = new TarjetaPreferencial();
        tarjetaNormal.setPrecio(1000);
        tarjetaPreferencial.setPrecio(1000);

        Visitor descuento = new Descuento();

        System.out.println("Valor pasaje con tarjetaNormal "+tarjetaNormal.aceptar(descuento));
        System.out.println("Valor pasaje con tarjetaPreferencial "+tarjetaPreferencial.aceptar(descuento));
    }

}
