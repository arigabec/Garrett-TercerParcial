package tercerParcial.E4;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServidor {
    private IServidor servidor1;
    private IServidor servidor2;
    private List<User> listUsers;


    public Proxy() {
        System.out.println("<<< Iniciando proxy y servidores >>>");
        System.out.println();
        listUsers = new ArrayList<>();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    public void addUser(User user){
        listUsers.add(user);
    }

    @Override
    public void userLogin(User user, String username, String pwd){
        if (username.equals(user.getUsername()) && pwd.equals(user.getPwd())){
            if (esPrimo(user.getId())){
                servidor1.userLogin(user, username, pwd);
            } else {
                servidor2.userLogin(user, username, pwd);
            }
        } else {
            System.out.println("Datos incorrectos ---> " + username + ", " + pwd);
            System.out.println();
        }
    }

    @Override
    public void atenderUsuarios() {
        servidor1.atenderUsuarios();
        servidor2.atenderUsuarios();
    }

    public boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}
