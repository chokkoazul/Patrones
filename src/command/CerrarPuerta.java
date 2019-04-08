package command;

public class CerrarPuerta implements Comando {

    private Puerta puerta;

    public CerrarPuerta(){
        this.puerta = new Puerta();
    }

    @Override
    public void ejecutar() {
        puerta.conectar();
        puerta.cerrar();
        puerta.desconectar();
    }

}
