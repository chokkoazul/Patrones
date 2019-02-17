package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Turista {
    protected List<Moneda> monedas = new ArrayList<Moneda>();

    public void agrega(Moneda moneda)
    {
        monedas.add(moneda);
    }

    public void suprime(Moneda moneda)
    {
        monedas.remove(moneda);
    }

    public void notifica()
    {
        for (Moneda moneda : monedas)
            moneda.actualiza();
    }

}

