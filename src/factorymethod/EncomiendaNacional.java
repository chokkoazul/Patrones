package factorymethod;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class EncomiendaNacional extends Encomienda {

    public EncomiendaNacional(int kilos) {
        super(kilos);
    }

    @Override
    public void enviar() {
        System.out.println("La encomienda nacional con peso "+kilos+" kilos, se ha enviado");
    }

    @Override
    public boolean validar() {
        return true;
    }

}
