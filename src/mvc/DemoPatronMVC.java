package mvc;

public class DemoPatronMVC {

    public static void main(String...args){
        Estudiante estudiante = recuperaEstudiante();

        EstudianteVista estudianteVista = new EstudianteVista();

        EstudianteControlador estudianteControlador = new EstudianteControlador(estudiante, estudianteVista);

        estudianteControlador.actualizarVista();

        estudianteControlador.setNombreEstudiante("Juan");
        estudianteControlador.actualizarVista();
    }

    private static Estudiante recuperaEstudiante() {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Cristian");
        estudiante.setApellido("Osorio");
        return estudiante;
    }
}
