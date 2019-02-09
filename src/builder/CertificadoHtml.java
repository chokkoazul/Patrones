package builder;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class CertificadoHtml extends Certificado {
    @Override
    public void agregaCertificado(String certificado) {
        if (certificado.startsWith("<HTML>")) {
            contenido.add(certificado);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Certificado HTML");
        for (String s : contenido)
            System.out.println(s);
    }
}
