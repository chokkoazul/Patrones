package state;

public class Transito {

    public static void main (String... args){

        Semaforo semaforo = new Semaforo();

        semaforo.mostrarComportamientoEstado();

        semaforo.setEstadoSemaforo(new EstadoNaranjo());

        semaforo.mostrarComportamientoEstado();

        semaforo.setEstadoSemaforo(new EstadoRojo());

        semaforo.mostrarComportamientoEstado();
    }
}
