package ir.ac.kntu;

import java.util.ArrayList;

public class SuperMarket {
    private String name;

    private String address;

    private ArrayList<String> products = new ArrayList<>();

    private ArrayList<Integer> stock = new ArrayList<>();

    public SuperMarket(String name, String address, ArrayList<String> products, ArrayList<Integer> stock) {
        this.name = name;
        this.address = address;
        this.products = products;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public ArrayList<Integer> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Integer> stock) {
        this.stock = stock;
    }
}
