package ejemploInicial;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public class PedidoUsa extends Pedido {
    @Override
    double calcularIVA() {
        return precioSinIVA * 0.8;
    }
}
