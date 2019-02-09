package factorymethod;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class Repartidor {

    protected abstract Encomienda creaEncomienda(int kilos);

    public void nuevaEncomienda(int kilos)
    {
        Encomienda encomienda = this.creaEncomienda(kilos);
        if (encomienda.validar())
        {
            encomienda.enviar();
        }
    }

}
