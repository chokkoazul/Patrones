package ejemploInicial;

/**
 * Created by Cristian Osorio (cristian.osorio@globant.com).
 */
public abstract class Pedido {

    double precioConIVA;
    double precioSinIVA;

    double calcularPrecioConIVA(){
      return precioConIVA = precioSinIVA + this.calcularIVA();
    };


    abstract double calcularIVA();

}
