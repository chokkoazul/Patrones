package factorymethod;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class Encomienda {

    protected int kilos;

    public Encomienda(int kilos) {
        this.kilos = kilos;
    }

    public abstract boolean validar();

    public abstract void enviar();
}
