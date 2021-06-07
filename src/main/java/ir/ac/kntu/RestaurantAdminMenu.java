package ir.ac.kntu;

import java.util.Scanner;

public class RestaurantAdminMenu extends Menu {

    public RestaurantAdminMenu() {
    }

    private Scanner scanner = new Scanner(System.in);

    private ListOfRestaurants listOfRestaurants = new ListOfRestaurants();

    @Override
    public void menu() {
        for (int i = 1 ; i <= listOfRestaurants.getRestaurants().size(); i++) {
            System.out.println(i +" : " + listOfRestaurants.getRestaurants().get(i).getNameOfRestaurant());
        }

        int input = scanner.nextInt();
        RestaurantAdmin restaurantAdmin = new RestaurantAdmin();
        switch (input) {
            case 1: {
                String userName = scanner.next();
                String password = scanner.next();
                for (int i = 0; i < restaurantAdmin.getUsernameKFC().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameKFC().get(i)) && password.equals(restaurantAdmin.getPasswordKFC().get(i))) {

                    }
                }
            }
            case 2: {
                String userName = scanner.next();
                String password = scanner.next();
                for (int i = 0; i < restaurantAdmin.getUsernameMCDONALD().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameMCDONALD().get(i)) && password.equals(restaurantAdmin.getPasswordMCDONALD().get(i))) {

                    }
                }
            }
            case 3: {
                String userName = scanner.next();
                String password = scanner.next();
                for (int i = 0; i < restaurantAdmin.getUsernameATAWICH().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameATAWICH().get(i)) && password.equals(restaurantAdmin.getPasswordATAWICH().get(i))) {

                    }
                }
            }
            case 4: {
                String userName = scanner.next();
                String password = scanner.next();
                for (int i = 0; i < restaurantAdmin.getUsernameKFC().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameKFC().get(i)) && password.equals(restaurantAdmin.getPasswordKFC().get(i))) {

                    }
                }
            }
            default:
                break;
        }
    }
}
