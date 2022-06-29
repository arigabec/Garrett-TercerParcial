package tercerParcial.E2;

public class CuadratrackElectrica implements ICuadratrack {
    private CuadraTrack cuadratrack;

    public CuadratrackElectrica(CuadraTrack cuadratrack) {
        this.cuadratrack = cuadratrack;
    }

    @Override
    public void cargarCombustible() {
        cuadratrack.cargando();
    }

    @Override
    public void estadoCombustible() {
        cuadratrack.estadoElectricidad();
    }
}
