package command;

public class Luces {
    public void conectar(){
        System.out.println("Conectando al sistema de iluminación...");
        System.out.println("Conexión al sistema de iluminación establecida.");
    }

    public void desconectar(){
        System.out.println("Desconectando del sistema de iluminación...");
        System.out.println("Se ha desconectado del sistema de iluminación.");
    }

    public void encender(){
        System.out.println("Encendiendo el sistema de iluminación...");
        System.out.println("Sistema de iluminación encendido.");
    }

    public void apagar() {
        System.out.println("Apagando el sistema de iluminación...");
        System.out.println("Sistema de iluminación apagado.");
    }
}
