package observer;

public class Visitante extends Turista {

    protected int dolares;

    public int getDolares() {
        return dolares;
    }

    public void setDolares(int dolares)
    {
        this.dolares = dolares;
        this.notifica();
    }
}
