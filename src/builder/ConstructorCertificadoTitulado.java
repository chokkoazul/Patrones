package builder;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class ConstructorCertificadoTitulado {
    protected Certificado certificado;

    public abstract void construyeCertificadoTitulo(String nombreAlumno, String nombreCarrera, int numeroDeSemestres);

    public abstract void construyeCertificadoDeNotas(String nombreAlumno, String anoIngreso);

    public Certificado resultado()
    {
        return certificado;
    }
}
