package state;

public class EstadoVerde extends EstadoSemaforo {

    @Override
    public void mostrar() {
        System.out.println("Hay luz verde puedes pasar...");
    }
}
