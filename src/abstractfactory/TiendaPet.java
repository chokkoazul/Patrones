package abstractfactory;

import java.util.Scanner;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class TiendaPet {

    public static int nComidaPerros = 3;
    public static int nComidaGatos = 2;

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        FabricaComidaMascota fabrica;
        ComidaPerro[] perros = new ComidaPerro[nComidaPerros];
        ComidaGato[] gatos = new ComidaGato[nComidaGatos];
        System.out.print("Desea buscar comida para mascota " +
                "Adulta (1) o Cachorro (2):");
        String eleccion = reader.next();

        if (eleccion.equals("1")) {
            fabrica = new FabricaComidaAdulto();
        } else {
            fabrica = new FabricaComidaCachorro();
        }
        for (int index = 0; index < nComidaPerros; index++)
            perros[index] = fabrica.creaComidaPerro("royal canin",
                    "poodle", 6 + index);

        for (int index = 0; index < nComidaGatos; index++)
            gatos[index] = fabrica.creaComidaGato("purina cat chow",
                    "persian", 2 + index);

        for (ComidaPerro comidaPerro : perros)
            comidaPerro.mostrarInfo();

        for (ComidaGato comidaGato : gatos)
            comidaGato.mostrarInfo();
    }

}
