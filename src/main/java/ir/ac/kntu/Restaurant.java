package ir.ac.kntu;

import java.util.ArrayList;

public class Restaurant {
    private String nameOfRestaurant;

    private String address;

    private PriceType priceType;

    private ArrayList<Integer> restaurantScore = new ArrayList<>();

    public Restaurant(String nameOfRestaurant, String address, PriceType priceType,
                      ArrayList<Integer> restaurantScore) {
        this.nameOfRestaurant = nameOfRestaurant;
        this.address = address;
        this.priceType = priceType;
        this.restaurantScore = restaurantScore;
    }


    public void firstRestaurantScore(ArrayList<Integer> restaurantScore) {
        restaurantScore.add(5);
    }

    public String getNameOfRestaurant() {
        return nameOfRestaurant;
    }


    public String getAddress() {
        return address;
    }


    public PriceType getPriceType() {
        return priceType;
    }


    public ArrayList<Integer> getRestaurantScore() {
        return restaurantScore;
    }

    public void setNameOfRestaurant(String nameOfRestaurant) {
        this.nameOfRestaurant = nameOfRestaurant;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPriceType(PriceType priceType) {
        this.priceType = priceType;
    }

    public void setRestaurantScore(ArrayList<Integer> restaurantScore) {
        this.restaurantScore = restaurantScore;
    }
}
