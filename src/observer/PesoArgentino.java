package observer;

public class PesoArgentino implements Moneda {

    protected Visitante visitante;
    protected int valorCambioXDolar = 3;

    public PesoArgentino(Visitante visitante) {
        this.visitante = visitante;
        visitante.agrega(this);
    }

    public void actualiza() {
        System.out.println("Tendría " + visitante.getDolares() * valorCambioXDolar + " Pesos Argentinos");
    }
}
