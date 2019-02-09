package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class ComidaGato {

    protected String marca;
    protected String raza;
    protected int cantidad;

    public ComidaGato(String marca, String raza, int cantidad) {
        this.marca = marca;
        this.raza = raza;
        this.cantidad = cantidad;
    }

    public abstract void mostrarInfo();
}
