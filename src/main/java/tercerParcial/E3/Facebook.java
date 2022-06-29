package tercerParcial.E3;

public class Facebook implements IRedSocial {
    private ISistema sistema;

    public Facebook(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("<<< MOSTRANDO DATOS DEL SISTEMA MEDIANTE FACEBOOK >>>");
        sistema.mostrarDatos();
    }
}
