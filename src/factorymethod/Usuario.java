package factorymethod;

import builder.ConstructorCertificadoTitulado;

import java.util.Scanner;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class Usuario {

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ConstructorCertificadoTitulado constructor;
        System.out.print("Enviar encomienda a territorio Nacional (1) o Internacional (2):");
        String seleccion = reader.next();

        Repartidor repartidor;

        if (seleccion.equals("1")){
            repartidor = new RepartidorNacional();
        }
        else{
            repartidor = new RepartidorInternacional();
        }

        repartidor.nuevaEncomienda(15);
    }
}
