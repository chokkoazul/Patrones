package state;

public class EstadoRojo extends EstadoSemaforo {
    @Override
    public void mostrar() {
        System.out.println("Hay luz roja debes detenerte...");
    }
}
