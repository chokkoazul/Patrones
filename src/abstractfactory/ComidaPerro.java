package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class ComidaPerro {

    protected String marca;
    protected String raza;
    protected int cantidad;

    public ComidaPerro(String marca, String raza, int cantidad) {
        this.marca = marca;
        this.raza = raza;
        this.cantidad = cantidad;
    }

    public abstract void mostrarInfo();
}
