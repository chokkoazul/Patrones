package builder;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class FuncionarioUniversidad {

    protected ConstructorCertificadoTitulado constructor;

    public FuncionarioUniversidad(ConstructorCertificadoTitulado constructorCertificadoTitulado)
    {
        this.constructor = constructorCertificadoTitulado;
    }

    public Certificado construye(String nombreAlumno, String nombreCarrera, int numeroDeSemestres, String anoIngreso)
    {
        constructor.construyeCertificadoTitulo(nombreAlumno, nombreCarrera, numeroDeSemestres);
        constructor.construyeCertificadoDeNotas(nombreAlumno, anoIngreso);
        Certificado certificado = constructor.resultado();
        return certificado;
    }


}
