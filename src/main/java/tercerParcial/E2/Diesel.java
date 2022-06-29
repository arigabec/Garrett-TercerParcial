package tercerParcial.E2;

import java.util.Random;

public class Diesel implements ICuadratrack {
    private int capacidad;

    public Diesel() {
        capacidad = 0;
    }

    @Override
    public void cargarCombustible() {
        // setea un atributo capacidad entre 0 - 50
        System.out.println("<<< Cargando gasolina diesel >>>");
        capacidad = new Random().nextInt(50)+1;// devuelve numeros del 0-49
        System.out.println("Capacidad: " + capacidad);
        System.out.println();
    }

    @Override
    public int estadoCombustible() {
        System.out.println("<<< Estado combustible >>>");
        int estado = new Random().nextInt(49)+1;// devuelve numeros del 0-48
        System.out.println("Estado: " + estado);
        System.out.println();
        return estado;
    }
}
