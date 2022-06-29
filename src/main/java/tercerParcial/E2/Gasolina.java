package tercerParcial.E2;

import java.util.Random;

public class Gasolina implements ICuadratrack {
    private int capacidad;

    public Gasolina() {
        capacidad = 0;
    }

    @Override
    public void cargarCombustible() {
        // setea un atributo capacidad entre 0 - 50
        System.out.println("<<< Cargando gasolina >>>");
        capacidad = new Random().nextInt(50);
        System.out.println("Capacidad: " + capacidad);
        System.out.println();
    }

    @Override
    public void estadoCombustible() {
        System.out.println("<<< Estado combustible >>>");
        System.out.println("Estado: " + new Random().nextInt(50));
        System.out.println();
    }
}
