package tercerParcial.E5;

public class Vidrio extends Accesorios {

    public Vidrio(ICelular baseComponent, int precio) {
        super(baseComponent, precio);
    }

    @Override
    public void showInformation(){
        infoPlugin();
        super.showInformation();
        /* int newCost =  +  ide.getCost();
        ide.setCost(newCost);
        */
    }

    public void infoPlugin(){
        System.out.println(">>> Vidrio");
    }

    @Override
    public void setCost(int cost) {

    }

    @Override
    public int getCost() {
        return 0;
    }
}
