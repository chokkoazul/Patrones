package builder;

import java.util.Scanner;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class AlumnoTitulado {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        ConstructorCertificadoTitulado constructor;
        System.out.print("Desea generar " + "certificado de titulación HTML (1) o PDF (2):");
        String seleccion = reader.next();

        if (seleccion.equals("1"))
        {
            constructor = new ConstructorCertificadoTituladoHtml();
        }
        else
        {
            constructor = new ConstructorCertificadoTituladoPdf();
        }

        FuncionarioUniversidad funcionarioUniversidad = new FuncionarioUniversidad(constructor);
        Certificado certificado = funcionarioUniversidad.construye("Cristian", "Ingenieria En Informática",
                                                                    10, "2002");
        certificado.imprime();
    }
}
