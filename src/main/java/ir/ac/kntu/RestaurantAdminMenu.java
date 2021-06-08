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
            System.out.println(i +" : " + listOfRestaurants.getRestaurants().get(i-1).getNameOfRestaurant());
        }
        int input = scanner.nextInt();
        RestaurantAdmin restaurantAdmin = new RestaurantAdmin();

        System.out.println("Enter your username: ");
        String userName = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();

        switch (input) {
            case 1: {
                for (int i = 0; i < restaurantAdmin.getUsernameKFC().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameKFC().get(i)) && password.equals(restaurantAdmin.getPasswordKFC().get(i))) {
                        change(input);
                    }
                }
            }
            case 2: {
                for (int i = 0; i < restaurantAdmin.getUsernameMCDONALD().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameMCDONALD().get(i)) && password.equals(restaurantAdmin.getPasswordMCDONALD().get(i))) {
                        change(input);
                    }
                }
            }
            case 3: {
                for (int i = 0; i < restaurantAdmin.getUsernameATAWICH().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameATAWICH().get(i)) && password.equals(restaurantAdmin.getPasswordATAWICH().get(i))) {
                        change(input);
                    }
                }
            }
            case 4: {
                for (int i = 0; i < restaurantAdmin.getUsernameKFC().size() ; i++) {
                    if (userName.equals(restaurantAdmin.getUsernameKFC().get(i)) && password.equals(restaurantAdmin.getPasswordKFC().get(i))) {
                        change(input);
                    }
                }
            }
            default:
                break;
        }
    }

    private Foods foods = new Foods();
    public void change(int inPut) {
        System.out.println("1: add new food");
        System.out.println("2: change information");
        int n = scanner.nextInt();
        switch (n) {
            case 1: {
                int tedad = 4;
                if (inPut == 1) {
                    foods.getFoodNames().add(tedad,scanner.next());
                    foods.getKfcFoodPrices().add(tedad, scanner.nextInt());
                    tedad++;
                }
                if (inPut == 2) {
                    foods.getFoodNames().add(tedad, scanner.next());
                    foods.getMcDonaldFoodPrices().add(tedad, scanner.nextInt());
                    tedad++;
                }
                if (inPut == 3) {
                    foods.getFoodNames().add(tedad, scanner.next());
                    foods.getAtawichFoodPrices().add(tedad, scanner.nextInt());
                    tedad++;
                }
                if (inPut == 4) {
                    foods.getFoodNames().add(tedad, scanner.next());
                    foods.getFerikasifFoodPrices().add(tedad, scanner.nextInt());
                    tedad++;
                }
            }
            case 2: {
                System.out.println("Change name? 1 for Yes, 2 for No");
                int vorodi = scanner.nextInt();
                if (vorodi == 1) {
                    listOfRestaurants.getRestaurants().get(inPut - 1).setNameOfRestaurant(scanner.next());
                }
                System.out.println("Change address? 1 for Yes, 2 for No");
                int vorodii = scanner.nextInt();
                if (vorodii == 1) {
                    listOfRestaurants.getRestaurants().get(inPut - 1).setAddress(scanner.next());
                }
            }
            default: {
                break;
            }
        }
    }
}
