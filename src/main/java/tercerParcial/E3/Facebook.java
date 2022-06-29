package tercerParcial.E3;

public class Facebook implements IRedSocial {

    @Override
    public void mostrarDatos(ISistema sistema) {
        System.out.println("<<< MOSTRANDO DATOS DEL SISTEMA MEDIANTE FACEBOOK >>>");
        sistema.showInfo();
    }
}
