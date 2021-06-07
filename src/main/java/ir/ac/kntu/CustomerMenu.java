package ir.ac.kntu;

import java.util.Scanner;

public class CustomerMenu extends Menu {

    public CustomerMenu() {
    }

    private ListOfRestaurants lor = new ListOfRestaurants();
    private Scanner scanner = new Scanner(System.in);
    private Foods foods = new Foods();
    private MyOrders myOrders = new MyOrders();

    @Override
    public void menu() {
        System.out.println("1: Open Restaurants");
        System.out.println("2: My last orders");
        System.out.println("3: Delivery menu");
        System.out.println("4: Restaurant's information");
        System.out.println("5: Exit");
        int input = scanner.nextInt();
        int t = 1;
        while (t == 1) {
            switch (input) {
                case 1: {
                    if ((lor.getRest1Startfd().isBefore(lor.getZdt()) && lor.getRest1Endfd().isAfter(lor.getZdt())) || (lor.getRest1Startsd().isBefore(lor.getZdt()) && lor.getRest1Endsd().isAfter(lor.getZdt()))) {
                        System.out.println("1: " + lor.getRestaurants().get(0).getNameOfRestaurant());
                    }
                    if ((lor.getRest2Startfd().isBefore(lor.getZdt()) && lor.getRest2Endfd().isAfter(lor.getZdt())) || (lor.getRest2Startsd().isBefore(lor.getZdt()) && lor.getRest2Endsd().isAfter(lor.getZdt()))) {
                        System.out.println("2: " + lor.getRestaurants().get(1).getNameOfRestaurant());
                    }
                    if ((lor.getRest3Startfd().isBefore(lor.getZdt()) && lor.getRest3Endfd().isAfter(lor.getZdt())) || (lor.getRest3Startsd().isBefore(lor.getZdt()) && lor.getRest3Endsd().isAfter(lor.getZdt()))) {
                        System.out.println("3: " + lor.getRestaurants().get(2).getNameOfRestaurant());
                    }
                    if (lor.getRest4Start().isBefore(lor.getZdt()) && lor.getRest4End().isAfter(lor.getZdt())) {
                        System.out.println("4: " + lor.getRestaurants().get(3).getNameOfRestaurant());
                    }
                    else {
                        System.out.println("All of restaurants are close");
                        return;
                    }
                    int s = scanner.nextInt();
                    buyFood(s);
                    break;
                }
                case 2: {
                    lastOrders();
                    break;
                }
                case 3: {
                    courier();
                    break;
                }
                case 4: {
                    for (int j = 1; j <= lor.getRestaurants().size(); j++) {
                        System.out.println(j + " : " + lor.getRestaurants().get(j - 1).getNameOfRestaurant());
                    }
                    int w = scanner.nextInt();
                    showRestaurantInformation(w);
                    break;
                }
                case 5: {
                    t = 0;
                    break;
                }
                default:
                    break;
            }
        }
    }

    public void buyFood(int input) {
        if (input == 1) {
            if ((lor.getRest1Startfd().isBefore(lor.getZdt()) && lor.getRest1Endfd().isAfter(lor.getZdt())) || (lor.getRest1Startsd().isBefore(lor.getZdt()) && lor.getRest1Endsd().isAfter(lor.getZdt()))) {
                System.out.println("1:" + foods.getFoodNames().get(1) + " -> Price:" + foods.getKfcFoodPrices().get(1));
                System.out.println("2:" + foods.getFoodNames().get(2) + " -> Price:" + foods.getKfcFoodPrices().get(2));
                int myfood = scanner.nextInt();
                myOrders.add(foods.getFoodNames().get(myfood));
                System.out.println("You bought " + foods.getFoodNames().get(myfood) + ". Your order has been registered. dar hale pardazesh. please wait...");
                canDeliverKFC(lor.getRestaurants().get(0));
                return;
            }
        }
        if (input == 2) {
            if ((lor.getRest2Startfd().isBefore(lor.getZdt()) && lor.getRest2Endfd().isAfter(lor.getZdt())) || (lor.getRest2Startsd().isBefore(lor.getZdt()) && lor.getRest2Endsd().isAfter(lor.getZdt()))) {
                System.out.println("1:" + foods.getFoodNames().get(0) + " -> Price:" + foods.getMcDonaldFoodPrices().get(0));
                System.out.println("2:" + foods.getFoodNames().get(1) + " -> Price:" + foods.getMcDonaldFoodPrices().get(1));
                System.out.println("3:" + foods.getFoodNames().get(2) + " -> Price:" + foods.getMcDonaldFoodPrices().get(2));
                int myfood = scanner.nextInt();
                myOrders.add(foods.getFoodNames().get(myfood - 1));
                System.out.println("You bought " + foods.getFoodNames().get(myfood - 1) + ". Your order has been registered. dar hale pardazesh. please wait...");
                canDelivermcDonald(lor.getRestaurants().get(1));
                return;
            }
        }
        if (input == 3) {
            if ((lor.getRest3Startfd().isBefore(lor.getZdt()) && lor.getRest3Endfd().isAfter(lor.getZdt())) || (lor.getRest3Endsd().isBefore(lor.getZdt()) && lor.getRest3Endsd().isAfter(lor.getZdt()))) {
                System.out.println("1:" + foods.getFoodNames().get(0) + " -> Price:" + foods.getAtawichFoodPrices().get(0));
                System.out.println("2:" + foods.getFoodNames().get(1) + " -> Price:" + foods.getAtawichFoodPrices().get(1));
                System.out.println("3+" + foods.getFoodNames().get(2) + " -> Price:" + foods.getAtawichFoodPrices().get(2));
                int myfood = scanner.nextInt();
                myOrders.add(foods.getFoodNames().get(myfood - 1));
                System.out.println("You bought " + foods.getFoodNames().get(myfood - 1) + ". Your order has been registered. dar hale pardazesh. please wait...");
                canDeliverAtawich(lor.getRestaurants().get(2));
                return;
            }
        }
        if (input == 4) {
            if (lor.getRest4Start().isBefore(lor.getZdt()) && lor.getRest4End().isAfter(lor.getZdt())) {
                System.out.println("1:" + foods.getFoodNames().get(0) + " -> Price:" + foods.getFerikasifFoodPrices().get(0));
                System.out.println("2:" + foods.getFoodNames().get(3) + " -> Price:" + foods.getFerikasifFoodPrices().get(3));
                int myfood = scanner.nextInt();
                if (myfood == 1) {
                    System.out.println("You bought" + foods.getFoodNames().get(0) + ". Your order has been registered. dar hale pardazesh. please wait...");
                    myOrders.add(foods.getFoodNames().get(0));
                }
                if (myfood == 2) {
                    System.out.println("You bought" + foods.getFoodNames().get(3) + ". Your order has been registered. dar hale pardazesh. please wait...");
                    myOrders.add(foods.getFoodNames().get(3));
                }
                canDeliverFerikasif(lor.getRestaurants().get(3));
                return;
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    public void lastOrders() {
        for (int i = 0; i < myOrders.getMyOrders().size(); i++) {
            System.out.println(myOrders.getMyOrders().get(i));
        }

    }

    public void showRestaurantInformation(int vurudi) {
        switch (vurudi) {
            case 1: {
                System.out.println("Name:" + lor.getRestaurants().get(0).getNameOfRestaurant());
                System.out.println("Restaurant Score:" + lor.getRestaurants().get(0).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(0).getAddress());
                System.out.println("Price type:" + "Name:" + lor.getRestaurants().get(0).getPriceType());
                break;
            }
            case 2: {
                System.out.println("Name:" + lor.getRestaurants().get(1).getNameOfRestaurant());
                System.out.println("Restaurant score:" + lor.getRestaurants().get(1).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(1).getAddress());
                System.out.println("Price type:" + lor.getRestaurants().get(1).getPriceType());
                break;
            }
            case 3: {
                System.out.println("Name:" + lor.getRestaurants().get(2).getNameOfRestaurant());
                System.out.println("Restaurant score:" + lor.getRestaurants().get(2).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(2).getAddress());
                System.out.println("Price type:" + lor.getRestaurants().get(2).getPriceType());
                break;
            }
            case 4: {
                System.out.println("Name:" + "Restaurant score:" + lor.getRestaurants().get(3).getNameOfRestaurant());
                System.out.println("Restaurant score:" + lor.getRestaurants().get(3).getRestaurantScore());
                System.out.println("Address:" + lor.getRestaurants().get(3).getAddress());
                System.out.println("Price type:" + lor.getRestaurants().get(3).getPriceType());
                break;
            }
            case 5:
                return;
            default:
                break;
        }
    }

    private final DeliveryIsAvailable deliveryIsAvailable = new DeliveryIsAvailable();

    public void canDeliverKFC(Restaurant restaurant) {
        if (deliveryIsAvailable.getKfcDeliveries().size() != 0) {
            System.out.println("Dar hale ersal :D");
        } else {
            System.out.println("No courier available now");
        }
    }

    public void canDelivermcDonald(Restaurant restaurant) {
        if (deliveryIsAvailable.getMcDonaldDeliveries().size() != 0) {
            System.out.println("Dar hale ersal :D");
        } else {
            System.out.println("No courier available now");
        }
    }

    public void canDeliverAtawich(Restaurant restaurant) {
        if (deliveryIsAvailable.getAtawichDeliveries().size() != 0) {
            System.out.println("Dar hale ersal :D");
        } else {
            System.out.println("No courier available now");
        }
    }

    public void canDeliverFerikasif(Restaurant restaurant) {
        if (deliveryIsAvailable.getFerikasifDeliveries().size() != 0) {
            System.out.println("Dar hale ersal :D");
        } else {
            System.out.println("No courier available now");
        }
    }

    public void courier() {
        System.out.println("1: Show courier information");
        System.out.println("2: Add new courier");
        System.out.println("3: Change courier's info");
        int input = scanner.nextInt();
        switch (input) {
            case 1: {
                System.out.println("Courier 1: " + deliveryIsAvailable.getDelivery1().getDeliveryVehicle());
                System.out.println("Courier 1: " + deliveryIsAvailable.getDelivery1().getCourierSalary());
                System.out.println("Courier 1: " + deliveryIsAvailable.getDelivery1().getSalary());
                System.out.println("Courier 2: " + deliveryIsAvailable.getDelivery2().getDeliveryVehicle());
                System.out.println("Courier 2: " + deliveryIsAvailable.getDelivery2().getCourierSalary());
                System.out.println("Courier 2: " + deliveryIsAvailable.getDelivery2().getSalary());
                System.out.println("Courier 3: " + deliveryIsAvailable.getDelivery3().getDeliveryVehicle());
                System.out.println("Courier 3: " + deliveryIsAvailable.getDelivery3().getCourierSalary());
                System.out.println("Courier 3: " + deliveryIsAvailable.getDelivery3().getSalary());
                System.out.println("Courier 4: " + deliveryIsAvailable.getDelivery4().getDeliveryVehicle());
                System.out.println("Courier 4: " + deliveryIsAvailable.getDelivery4().getCourierSalary());
                System.out.println("Courier 4: " + deliveryIsAvailable.getDelivery4().getSalary());
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                return;
            }
            default:
                break;
        }
    }
}
