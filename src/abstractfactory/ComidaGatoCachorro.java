package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class ComidaGatoCachorro extends ComidaGato {

    public ComidaGatoCachorro(String marca, String raza, int cantidad) {
        super(marca, raza, cantidad);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(
                "Comida para gato cachorro de marca: " + marca +
                        " para raza: " + raza + " de cantidad: " +
                        cantidad + " kilos");
    }
}
