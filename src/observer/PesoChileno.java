package observer;

public class PesoChileno implements Moneda {
    protected Visitante visitante;
    protected int valorCambioXDolar = 600;

    public PesoChileno(Visitante visitante) {
        this.visitante = visitante;
        visitante.agrega(this);
    }

    public void actualiza() {
        System.out.println("Tendría " + visitante.getDolares() * valorCambioXDolar + " Pesos Chilenos");
    }
}
