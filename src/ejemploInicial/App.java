package ejemploInicial;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class App {

    public static void main(String[] arg){
        Pedido pedidoChile = new PedidoChile();
        pedidoChile.precioSinIVA = 30000;

        System.out.println("Valor sin iva..."+pedidoChile.precioSinIVA);
        System.out.println("Valor con iva..."+pedidoChile.calcularPrecioConIVA());

        Pedido pedidoAlemania = new PedidoAlemania();
        pedidoAlemania.precioSinIVA = 30000;

        System.out.println("Valor sin iva..."+pedidoAlemania.precioSinIVA);
        System.out.println("Valor con iva..."+pedidoAlemania.calcularPrecioConIVA());

        Pedido pedidoUsa = new PedidoUsa();
        pedidoUsa.precioSinIVA = 30000;

        System.out.println("Valor sin iva..."+pedidoUsa.precioSinIVA);
        System.out.println("Valor con iva..."+pedidoUsa.calcularPrecioConIVA());


    }
}
