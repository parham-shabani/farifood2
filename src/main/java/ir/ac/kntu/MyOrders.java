package ir.ac.kntu;

import java.util.ArrayList;

public class MyOrders {
    private ArrayList<String> myOrders = new ArrayList<>();

    public MyOrders() {
    }

    public void add(String food) {
        myOrders.add(food);
    }

    public ArrayList<String> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(ArrayList<String> myOrders) {
        this.myOrders = myOrders;
    }
}
