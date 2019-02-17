package observer;

public class SolPeruano implements Moneda {
    protected Visitante visitante;
    protected int valorCambioXDolar = 30;

    public SolPeruano(Visitante visitante) {
        this.visitante = visitante;
        visitante.agrega(this);
    }

    public void actualiza() {
        System.out.println("Tendría " + visitante.getDolares() * valorCambioXDolar + " Soles Peruanos");
    }

}
