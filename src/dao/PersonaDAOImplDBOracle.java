package dao;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImplDBOracle implements PersonaDAO {
    @Override
    public List<Persona> listasTodos() {
        System.out.println("**********Listando datos de Oracle********");
        List<Persona> personas = new ArrayList<>();
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Cristian");
        personas.add(persona);
        Persona persona2 = new Persona();
        persona2.setId(2);
        persona2.setNombre("Carlos");
        personas.add(persona2);
        Persona persona3 = new Persona();
        persona3.setId(3);
        persona3.setNombre("Pepe");
        personas.add(persona3);
        Persona persona4 = new Persona();
        persona4.setId(4);
        persona4.setNombre("Juan");
        personas.add(persona4);
        Persona persona5 = new Persona();
        persona5.setId(5);
        persona5.setNombre("Roberto");
        personas.add(persona5);
        return personas;
    }

    @Override
    public Persona leerPorId(int i) {
        return null;
    }

    @Override
    public void agregarPersona(Persona persona) {
        System.out.println("Se agrega persona " + persona.toString() + " a base de datos de oracle...");
    }

    @Override
    public void actualizarPersona(Persona persona) {
        System.out.println("Se actualiza persona " + persona.toString() + " a base de datos de oracle...");
    }

    @Override
    public void eliminarPersona(int id) {
        System.out.println("Se elimina persona con id " + id + " a base de datos de oracle...");
    }
}
