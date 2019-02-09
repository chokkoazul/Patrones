package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class ComidaPerroCachorro extends ComidaPerro {

    public ComidaPerroCachorro(String marca, String raza, int cantidad) {
        super(marca, raza, cantidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(
                "Comida para perro cachorro de marca: " + marca +
                        " para raza: " + raza + " de cantidad: " +
                        cantidad + " kilos");
    }
}
