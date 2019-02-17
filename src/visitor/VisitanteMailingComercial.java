package visitor;

public class VisitanteMailingComercial implements Visitante{

    @Override
    public void visita(EmpresaSinFilial empresa) {
        System.out.println("Envía un email a " + empresa.getNombre() +
                " dirección: " + empresa.getEmail() + " Propuesta comercial para su empresa");
    }

    @Override
    public void visita(EmpresaMadre empresa) {
        System.out.println("Envía un email a " +
                empresa.getNombre() + " dirección: " + empresa.getEmail()
                + " Propuesta comercial para su grupo");
        System.out.println("Impresión de un correo para " +
                empresa.getNombre() + " dirección: " +
                empresa.getDireccion() +
                " Propuesta comercial para su grupo");
    }
}
