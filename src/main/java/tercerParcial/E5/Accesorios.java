package tercerParcial.E5;

public class Accesorios implements ICelular {
    protected ICelular celular;
    protected int costA;

    public Accesorios(ICelular celular, int costA) {
        this.celular = celular;
        this.costA = costA;
    }

    @Override
    public void showInformation() {
        celular.showInformation();
    }

    @Override
    public void setCost(int cost) {

    }

    @Override
    public int getCost() {
        return 0;
    }
}
