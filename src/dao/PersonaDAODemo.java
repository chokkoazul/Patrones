package dao;

import java.util.Scanner;

public class PersonaDAODemo {

    public static void main(String... args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Selecciona la base de datos Local (1) o Producción (2):");
        String seleccion = reader.next();
        PersonaDAO personaDAO;

        personaDAO = FactoryDao.getDaoImpl(seleccion);

        System.out.println("Recupera Personas ...");
        personaDAO.listasTodos().forEach(persona -> System.out.println(persona.getNombre()));

        System.out.println("Agregar una persona ...");
        Persona persona = new Persona();
        persona.setId(10);
        persona.setNombre("Marcelo");
        personaDAO.agregarPersona(persona);
    }
}
