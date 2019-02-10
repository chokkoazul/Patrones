package strategy;

public class SistemaOperativo {

    private EstrategiaAntivirus estrategiaAntivirus;

    public SistemaOperativo(EstrategiaAntivirus estrategiaAntivirus){
        this.estrategiaAntivirus = estrategiaAntivirus;
    }

    public void analizar(){
        estrategiaAntivirus.analizar();
    }

}
