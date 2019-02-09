package builder;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class ConstructorCertificadoTituladoHtml extends ConstructorCertificadoTitulado {
    public ConstructorCertificadoTituladoHtml() {
        certificado = new CertificadoHtml();
    }

    @Override
    public void construyeCertificadoTitulo(String nombreAlumno, String nombreCarrera, int numeroDeSemestres) {
        String contenidoCertificado = "<HTML>Certifico que " + nombreAlumno + " a sido graduado de la carrera "
                                        + nombreCarrera + " de un total de " + numeroDeSemestres + " Semestres</HTML>";
        certificado.agregaCertificado(contenidoCertificado);
    }

    @Override
    public void construyeCertificadoDeNotas(String nombreAlumno, String anoIngreso) {
        String contenidoCertificado = "<HTML>Concentracion de notas del alumno " + nombreAlumno
                                        + " el cual ingreso el año " + anoIngreso + "</HTML>";
        certificado.agregaCertificado(contenidoCertificado);
    }
}
