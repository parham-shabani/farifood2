package ir.ac.kntu;

import java.util.ArrayList;

public class Admin {

    private ArrayList<String> username = new ArrayList<>();
    private ArrayList<String> password = new ArrayList<>();

    public Admin() {
        setUsername(username);
        setPassword(password);
    }

    public void setUsername(ArrayList<String> username) {
        this.username = username;
        username.add(0, "1234");
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
        password.add(0, "5678");
    }


    public ArrayList<String> getUsername() {
        return username;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public static void addAdmin() {

    }


}
