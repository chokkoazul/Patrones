package dao;

public class FactoryDao {

    public static PersonaDAO getDaoImpl(String opcion) {
        if (opcion.equals("1"))
            return new PersonaDAOImplDBLocal();
        else
            return new PersonaDAOImplDBProd();
    }
}
