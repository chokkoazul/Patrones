package builder;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class CertificadoPdf extends Certificado {
    @Override
    public void agregaCertificado(String certificado) {
        if (certificado.startsWith("<PDF>")) {
            contenido.add(certificado);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Certificado PDF");
        for (String s : contenido)
            System.out.println(s);
    }
}
