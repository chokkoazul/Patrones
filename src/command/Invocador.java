package command;

public class Invocador {

    private Comando comando;

    public Invocador(Comando comando){
        this.comando = comando;
    }

    public void ejecutarComando(){
        comando.ejecutar();
    }
}
