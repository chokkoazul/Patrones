package singleton;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Cliente {

    public static void main (String ... arg){
        Documento documento1 = Documento.getInstancia();
        System.out.println(documento1.hashCode());

        Documento documento2 = Documento.getInstancia();
        System.out.println(documento2.hashCode());
    }
}
