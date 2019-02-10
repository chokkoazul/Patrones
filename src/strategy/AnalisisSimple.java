package strategy;

public class AnalisisSimple implements EstrategiaAntivirus {

    @Override
    public void analizar() {
        iniciarAnalisis();
        analizarArchivos();
        finalizaAnalisis();
    }

    private void finalizaAnalisis() {
        System.out.println("Finalizando analisis...");
    }

    private void analizarArchivos() {
        System.out.println("Analizando archivos...");
    }

    private void iniciarAnalisis() {
        System.out.println("Iniciando analisis...");
    }
}
