package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String password;
        String username;
        ArrayList<String> userName = new ArrayList<>();
        ArrayList<String> phoneNumber = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Admin's Menu");
        System.out.println("2: Customer menu");
        System.out.println("3: Admin of restaurant's menu");
        int whoAreYou = scanner.nextInt();
        if (whoAreYou == 1) {
            System.out.println("Enter your Username");
            username = scanner.next();
            System.out.println("Enter password");
            password = scanner.next();
            Admin admin = new Admin();
            for (int i = 0; i < admin.getUsername().size(); i++) {
                if (username.equals(admin.getUsername().get(i)) && password.equals(admin.getPassword().get(i))) {
                    AdminMenu adminMenu = new AdminMenu();
                    adminMenu.menu();
                }
            }
        }
        if (whoAreYou == 2) {
            Customer customer = new Customer();
            System.out.println("Enter your address");
            userName.add(scanner.next());
            System.out.println("Enter your phone number");
            phoneNumber.add(scanner.next());
            customer.setAddress(userName);
            customer.setPhoneNumber(phoneNumber);
            CustomerMenu customerMenu = new CustomerMenu();
            customerMenu.menu();
        }
        if (whoAreYou == 3) {
//            System.out.println("Enter username: ");
//            String usrname = scanner.next();
//            System.out.println("Enter password: ");
//            String passwrd = scanner.next();
//            RestaurantAdmin restaurantAdmin = new RestaurantAdmin();
//            for (int i = 0; i < 5; i++) { //each restaurant has 5 admins maximum
//                if (((usrname.equals(restaurantAdmin.getUsernameKFC().get(i))) && (passwrd.equals(restaurantAdmin.getPasswordKFC().get(i)))) ||
//                        ((usrname.equals(restaurantAdmin.getUsernameATAWICH().get(i))) && passwrd.equals(restaurantAdmin.getPasswordATAWICH().get(i))) ||
//                        ((usrname.equals(restaurantAdmin.getUsernameMCDONALD().get(i)) && passwrd.equals(restaurantAdmin.getPasswordMCDONALD().get(i)))) ||
//                        ((usrname.equals(restaurantAdmin.getUsernameFERIKASIF().get(i))) && passwrd.equals(restaurantAdmin.getPasswordFERIKASIF().get(i)))
//                ) {
//                    RestaurantAdminMenu restaurantAdminMenu = new RestaurantAdminMenu();
//                    restaurantAdminMenu.menu();
////                }
////            }
            RestaurantAdminMenu restaurantAdminMenu = new RestaurantAdminMenu();
            restaurantAdminMenu.menu();
        }
    }
}
