package command;

public class ApagarLuces implements Comando {

    private Luces luces;

    public ApagarLuces(){
        this.luces = new Luces();
    }

    @Override
    public void ejecutar(){
        luces.conectar();
        luces.apagar();
        luces.desconectar();
    }
}
