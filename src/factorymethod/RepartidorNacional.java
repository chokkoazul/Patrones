package factorymethod;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class RepartidorNacional extends Repartidor {
    @Override
    protected Encomienda creaEncomienda(int kilos) {
        return new EncomiendaNacional(kilos);
    }
}
