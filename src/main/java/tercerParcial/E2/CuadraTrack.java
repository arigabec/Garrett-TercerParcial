package tercerParcial.E2;

import java.util.Random;

public class CuadraTrack implements IElectricos {
    private int bateria;

    public CuadraTrack(){
        bateria = 0;
    }

    @Override
    public void cargando() {
        // setea un número par entre 0-20
        System.out.println("<<< Cargando bateria >>>");
        bateria = new Random().nextInt(20);
        System.out.println("Capacidad: " + bateria);
        System.out.println();

    }

    @Override
    public void estadoElectricidad() {
        // retorna numero random entre 1 - 10
        System.out.println("<<< Estado bateria >>>");
        System.out.println("Estado: " + new Random().nextInt(10));
        System.out.println();
    }
}
