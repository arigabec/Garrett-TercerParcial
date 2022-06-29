package tercerParcial.E5;

public class Samsung implements ICelular {
    private int ram;
    private int almacenamiento;
    private int cpu;
    private int cost;

    public Samsung(int ram, int almacenamiento, int cpu, int cost) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.cost = cost;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void showInformation() {
        System.out.println("*** Samsung");
        System.out.println("Cost: " + cost);
    }
}
