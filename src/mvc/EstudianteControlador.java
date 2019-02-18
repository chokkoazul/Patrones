package mvc;

public class EstudianteControlador {

    private Estudiante modelo;
    private EstudianteVista vista;

    public EstudianteControlador(Estudiante modelo, EstudianteVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreEstudiante(String nombre){
        modelo.setNombre(nombre);
    }

    public String getNombreEstudiante(){
        return modelo.getNombre();
    }

    public void setApellidoEstudiante(String apellido){
        modelo.setApellido(apellido);
    }

    public String getApellidoEstudiante(){
        return modelo.getApellido();
    }

    public void actualizarVista(){
        vista.imprimirVista(modelo.getNombre(), modelo.getApellido());
    }
}
