package dao;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImplDBLocal implements PersonaDAO {
    @Override
    public List<Persona> listasTodos() {
        List<Persona> personas = new ArrayList<>();
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Cristian");
        personas.add(persona);
        Persona persona2 = new Persona();
        persona2.setId(2);
        persona2.setNombre("Carlos");
        personas.add(persona2);
        return personas;
    }

    @Override
    public Persona leerPorId(int i) {
        return null;
    }

    @Override
    public void agregarPersona(Persona persona) {
        System.out.println("Se agrega persona " + persona.toString() + " a base de datos local...");
    }

    @Override
    public void actualizarPersona(Persona persona) {
        System.out.println("Se actualiza persona " + persona.toString() + " a base de datos local...");
    }

    @Override
    public void eliminarPersona(int id) {
        System.out.println("Se elimina persona con id " + id + " a base de datos local...");
    }
}
