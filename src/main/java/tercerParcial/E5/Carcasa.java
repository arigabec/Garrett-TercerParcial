package tercerParcial.E5;

public class Carcasa extends Accesorios {

    public Carcasa(ICelular baseComponent, int precio) {
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
        System.out.println(">>> Carcasa");
    }

    @Override
    public void setCost(int cost) {

    }

    @Override
    public int getCost() {
        return 0;
    }
}
