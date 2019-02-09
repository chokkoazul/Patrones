package factorymethod;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class RepartidorInternacional extends Repartidor {
    @Override
    protected Encomienda creaEncomienda(int kilos) {
        return new EncomiendaInternacional(kilos);
    }
}
