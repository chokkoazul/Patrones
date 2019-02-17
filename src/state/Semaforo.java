package state;

public class Semaforo {

    private EstadoSemaforo estadoSemaforo;

    public Semaforo() {
        this.estadoSemaforo = new EstadoVerde();
    }

    public void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
        this.estadoSemaforo = estadoSemaforo;
    }

    public void mostrarComportamientoEstado(){
        this.estadoSemaforo.mostrar();
    }
}
