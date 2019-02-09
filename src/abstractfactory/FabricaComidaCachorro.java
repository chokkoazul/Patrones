package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class FabricaComidaCachorro implements FabricaComidaMascota {

    @Override
    public ComidaPerro creaComidaPerro(String marca, String raza, int cantidad) {
        return new ComidaPerroCachorro(marca, raza, cantidad);
    }

    @Override
    public ComidaGato creaComidaGato(String marca, String raza, int cantidad) {
        return new ComidaGatoCachorro(marca, raza, cantidad);
    }

}
