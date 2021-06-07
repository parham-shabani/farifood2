package ir.ac.kntu;

import java.util.ArrayList;

public class RestaurantAdmin {

    private ArrayList<String> usernameKFC = new ArrayList<>();

    private ArrayList<String> passwordKFC = new ArrayList<>();

    private ArrayList<String> usernameMCDONALD = new ArrayList<>();

    private ArrayList<String> passwordMCDONALD = new ArrayList<>();

    private ArrayList<String> usernameATAWICH = new ArrayList<>();

    private ArrayList<String> passwordATAWICH = new ArrayList<>();

    private ArrayList<String> usernameFERIKASIF = new ArrayList<>();

    private ArrayList<String> passwordFERIKASIF = new ArrayList<>();


    public RestaurantAdmin() {
        setUsernameKFC(usernameKFC);
        setPasswordKFC(passwordKFC);
        setUsernameMCDONALD(usernameMCDONALD);
        setPasswordMCDONALD(passwordMCDONALD);
        setUsernameATAWICH(usernameATAWICH);
        setPasswordATAWICH(passwordATAWICH);
        setUsernameFERIKASIF(usernameFERIKASIF);
        setPasswordFERIKASIF(passwordFERIKASIF);
    }


    public ArrayList<String> getUsernameKFC() {
        return usernameKFC;
    }

    public void setUsernameKFC(ArrayList<String> usernameKFC) {
        this.usernameKFC = usernameKFC;
        usernameKFC.add("1234");
    }

    public ArrayList<String> getPasswordKFC() {
        return passwordKFC;
    }

    public void setPasswordKFC(ArrayList<String> passwordKFC) {
        this.passwordKFC = passwordKFC;
        passwordKFC.add("5678");
    }

    public ArrayList<String> getUsernameMCDONALD() {
        return usernameMCDONALD;
    }

    public void setUsernameMCDONALD(ArrayList<String> usernameMCDONALD) {
        this.usernameMCDONALD = usernameMCDONALD;
        usernameMCDONALD.add("1111");
    }

    public ArrayList<String> getPasswordMCDONALD() {
        return passwordMCDONALD;
    }

    public void setPasswordMCDONALD(ArrayList<String> passwordMCDONALD) {
        this.passwordMCDONALD = passwordMCDONALD;
        passwordMCDONALD.add("2222");
    }

    public ArrayList<String> getUsernameATAWICH() {
        return usernameATAWICH;
    }

    public void setUsernameATAWICH(ArrayList<String> usernameATAWICH) {
        this.usernameATAWICH = usernameATAWICH;
        usernameATAWICH.add("3333");
    }

    public ArrayList<String> getPasswordATAWICH() {
        return passwordATAWICH;
    }

    public void setPasswordATAWICH(ArrayList<String> passwordATAWICH) {
        this.passwordATAWICH = passwordATAWICH;
        passwordATAWICH.add("4444");
    }

    public ArrayList<String> getUsernameFERIKASIF() {
        return usernameFERIKASIF;
    }

    public void setUsernameFERIKASIF(ArrayList<String> usernameFERIKASIF) {
        this.usernameFERIKASIF = usernameFERIKASIF;
        usernameFERIKASIF.add("5555");
    }

    public ArrayList<String> getPasswordFERIKASIF() {
        return passwordFERIKASIF;
    }

    public void setPasswordFERIKASIF(ArrayList<String> passwordFERIKASIF) {
        this.passwordFERIKASIF = passwordFERIKASIF;
        passwordFERIKASIF.add("8888");
    }
}
