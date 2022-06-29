package tercerParcial.E4;

public class User {
    private String username;
    private int id;
    private String pwd;

    public User(String username, int id, String pwd) {
        this.username = username;
        this.id = id;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void showInfo(){
        System.out.println("<<< USER INFORMATION >>>");
        System.out.println("Username: " + username);
        System.out.println("User id: " + id);
        System.out.println();
    }
}
