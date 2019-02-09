package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class Certificado {

    protected List<String> contenido = new ArrayList<String>();

    public abstract void agregaCertificado(String certificado);

    public abstract void imprime();
}
