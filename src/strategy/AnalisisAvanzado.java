package strategy;

public class AnalisisAvanzado implements EstrategiaAntivirus {

    @Override
    public void analizar() {
        iniciarAnalisis();
        analizarUsoDeMemoria();
        analizarArchivos();
        enviarReporteACorreo();
        finalizaAnalisis();
    }

    private void enviarReporteACorreo() {
        System.out.println("Enviando reporte a correo...");
    }

    private void analizarUsoDeMemoria() {
        System.out.println("Analizando uso de memoria...");
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
