package command;

import java.util.Scanner;

public class Cliente {

    public static void main(String ... args){
        Comando comando = null;

        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el numero de comando a ejecutar... (1) Encender luces, (2) Apagar luces, (3) Abrir puerta o (4) Cerrar puerta:");
        String seleccionComando = reader.next();

        if("1".equals(seleccionComando)){
           comando = new EncenderLuces();
        } else if("2".equals(seleccionComando)){
           comando = new ApagarLuces();
        } else if("3".equals(seleccionComando)){
           comando = new AbrirPuerta();
        } else if("4".equals(seleccionComando)){
           comando = new CerrarPuerta();
        }

        Invocador invocador = new Invocador(comando);
        invocador.ejecutarComando();
    }
}
