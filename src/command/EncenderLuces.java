package command;

public class EncenderLuces implements Comando {
    private Luces luces;

    public EncenderLuces(){
        this.luces = new Luces();
    }

    @Override
    public void ejecutar(){
        luces.conectar();
        luces.encender();
        luces.desconectar();
    }
}
