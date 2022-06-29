package tercerParcial.E3;

public class Whatsapp implements IRedSocial {
    private ISistema sistema;

    public Whatsapp(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("<<< MOSTRANDO DATOS DEL SISTEMA MEDIANTE WHATSAPP >>>");
        sistema.mostrarDatos();
    }
}
