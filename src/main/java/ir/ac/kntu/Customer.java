package ir.ac.kntu;

import java.util.ArrayList;

public class Customer {
    private ArrayList<String> address = new ArrayList<>();

    private ArrayList<String> phoneNumber = new ArrayList<>();

    public Customer() {
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(ArrayList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
