package singleton;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Documento {

    private static Documento instancia = null;

    private Documento(){}

    public static Documento getInstancia(){
        if (instancia == null)
            instancia = new Documento();

        return instancia;
    }
}
