package abstractfactory;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public interface FabricaComidaMascota {

    ComidaPerro creaComidaPerro(String marca, String raza, int cantidad);

    ComidaGato creaComidaGato(String marca, String raza, int cantidad);

}
