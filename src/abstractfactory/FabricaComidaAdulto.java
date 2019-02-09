package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class FabricaComidaAdulto implements FabricaComidaMascota {

    @Override
    public ComidaPerro creaComidaPerro(String marca, String raza, int cantidad) {
        return new ComidaPerroAdulto(marca, raza, cantidad);
    }

    @Override
    public ComidaGato creaComidaGato(String marca, String raza, int cantidad) {
        return new ComidaGatoAdulto(marca, raza, cantidad);
    }

}
