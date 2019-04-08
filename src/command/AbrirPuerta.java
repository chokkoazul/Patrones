package command;

public class AbrirPuerta implements Comando {

    private Puerta puerta;

    public AbrirPuerta(){
        this.puerta = new Puerta();
    }

    @Override
    public void ejecutar() {
        puerta.conectar();
        puerta.abrir();
        puerta.desconectar();
    }
}
