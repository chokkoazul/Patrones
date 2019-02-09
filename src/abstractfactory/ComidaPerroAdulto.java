package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class ComidaPerroAdulto extends ComidaPerro {

    public ComidaPerroAdulto(String marca, String raza, int cantidad) {
        super(marca, raza, cantidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(
                "Comida para perro adulto de marca: " + marca +
                        " para raza: " + raza + " de cantidad: " +
                        cantidad + " kilos");
    }
}
