package command;

public class Puerta {
    public void conectar(){
        System.out.println("Conectando al sistema de puerta...");
        System.out.println("Conexión al sistema de puerta establecido.");
    }

    public void desconectar(){
        System.out.println("Desconectando del sistema de puerta...");
        System.out.println("Se ha desconectado del sistema de puerta.");
    }

    public void abrir(){
        System.out.println("Abriendo la puerta...");
        System.out.println("Puerta abierta.");
    }

    public void cerrar(){
        System.out.println("Cerrando la puerta...");
        System.out.println("Puerta cerrada.");
    }
}
