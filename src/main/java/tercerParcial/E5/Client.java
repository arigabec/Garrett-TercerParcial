package tercerParcial.E5;

public class Client {
    public static void main (String []args){
        ICelular apple = new Apple(4, 128, 4, 500);

        apple = new Carcasa(apple, 30);

        apple.showInformation();


    }
}
