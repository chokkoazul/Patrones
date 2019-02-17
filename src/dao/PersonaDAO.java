package dao;

import java.util.List;

public interface PersonaDAO {

    List<Persona> listasTodos();

    Persona leerPorId(int i);

    void agregarPersona(Persona persona);

    void actualizarPersona(Persona persona);

    void eliminarPersona(int id);
}
