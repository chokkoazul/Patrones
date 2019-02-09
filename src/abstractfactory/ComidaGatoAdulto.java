package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class ComidaGatoAdulto extends ComidaGato {

    public ComidaGatoAdulto(String marca, String raza, int cantidad) {
        super(marca, raza, cantidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(
                "Comida para gato adulto de marca: " + marca +
                        " para raza: " + raza + " de cantidad: " +
                        cantidad + " kilos");
    }
}
