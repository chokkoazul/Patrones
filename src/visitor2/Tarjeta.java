package visitor2;

public abstract class Tarjeta {
    private double precio;

    public abstract double aceptar (Visitor visitor);

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
