package builder;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class ConstructorCertificadoTituladoPdf extends ConstructorCertificadoTitulado {

    public ConstructorCertificadoTituladoPdf() {
        certificado = new CertificadoPdf();
    }

    @Override
    public void construyeCertificadoTitulo(String nombreAlumno, String nombreCarrera, int numeroDeSemestres) {
        String contenidoCertificado = "<PDF>Certifico que " + nombreAlumno + " a sido graduado de la carrera "
                                        + nombreCarrera + " de un total de " + numeroDeSemestres + " Semestres</PDF>";
        certificado.agregaCertificado(contenidoCertificado);
    }

    @Override
    public void construyeCertificadoDeNotas(String nombreAlumno, String anoIngreso) {
        String contenidoCertificado = "<PDF>Concentracion de notas del alumno " + nombreAlumno
                                        + " el cual ingreso el año " + anoIngreso + "</PDF>";
        certificado.agregaCertificado(contenidoCertificado);
    }
}
