package strategy;

import java.util.Scanner;

public class PC {

    public static void main (String ... args){
        Scanner reader = new Scanner(System.in);
        SistemaOperativo sistemaOperativo;
        System.out.print("¿Que analisis deseas utilizar? " +
                "Simple (1) o Avanzado (2):");
        String eleccion = reader.next();

        if (eleccion.equals("1"))
            sistemaOperativo = new SistemaOperativo(new AnalisisSimple());
        else
            sistemaOperativo = new SistemaOperativo(new AnalisisAvanzado());

        sistemaOperativo.analizar();
    }
}
