package factorymethod;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class EncomiendaInternacional extends Encomienda {
    public EncomiendaInternacional(int kilos) {
        super(kilos);
    }

    @Override
    public void enviar() {
        System.out.println("La encomienda internacional con peso "+kilos+" kilos, se ha enviado");
    }

    @Override
    public boolean validar() {
        return (kilos <= 10);
    }

}
