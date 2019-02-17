package observer;

public class SimuladorDivisas {

    public static void main(String[] args) {
        Visitante visitante = new Visitante();

        new PesoArgentino(visitante);
        new PesoChileno(visitante);
        new SolPeruano(visitante);

        System.out.println("--------------------------------");
        System.out.println("Si desea cambiar 20 dolares...");
        visitante.setDolares(20);
        System.out.println("--------------------------------");
        System.out.println("Si desea cambiar 30 dolares...");
        visitante.setDolares(30);
        System.out.println("--------------------------------");
        System.out.println("Si desea cambiar 50 dolares...");
        visitante.setDolares(50);
    }
}
