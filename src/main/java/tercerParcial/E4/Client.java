package tercerParcial.E4;

public class Client {
    public static void main(String[] args){
        Proxy proxy = new Proxy();

        User u1 = new User("andres13", 13, "a13");
        User u2 = new User("luis21", 21, "l21");

        proxy.addUser(u1);
        proxy.addUser(u2);

        proxy.userLogin(u1, "andres13", "a13");
        proxy.userLogin(u2, "luis21", "a13");
        proxy.userLogin(u2, "luis21", "l21");

        proxy.atenderUsuarios();
    }
}
