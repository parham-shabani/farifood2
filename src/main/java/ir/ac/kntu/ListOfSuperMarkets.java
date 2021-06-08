package ir.ac.kntu;

import java.util.ArrayList;

public class ListOfSuperMarkets {
    private ArrayList<String> productsS1 = new ArrayList<>();

    private ArrayList<Integer> stockS1 = new ArrayList<>();

    private ArrayList<String> productsS2 = new ArrayList<>();

    private ArrayList<Integer> stockS2 = new ArrayList<>();

    private ArrayList<SuperMarket> superMarkets = new ArrayList<>();

    public ListOfSuperMarkets() {
        main();
    }

    public void main() {
        productsS1.add(0,"chips");
        productsS1.add(1,"soda");
        productsS1.add(2,"yoghurt");
        stockS1.add(0,6);
        stockS1.add(1,9);
        stockS1.add(2,2);

        productsS2.add(0,"chips");
        productsS2.add(1,"soda");
        productsS2.add(2,"yoghurt");
        stockS2.add(0,3);
        stockS2.add(1,1);
        stockS2.add(2,3);

        SuperMarket superMarket1 = new SuperMarket("parvane", "tehran", productsS1, stockS1);
        SuperMarket superMarket2 = new SuperMarket("karimi", "qazvin", productsS2, stockS2);

        superMarkets.add(superMarket1);
        superMarkets.add(superMarket2);
    }

    public ArrayList<SuperMarket> getSuperMarkets() {
        return superMarkets;
    }

    public void setSuperMarkets(ArrayList<SuperMarket> superMarkets) {
        this.superMarkets = superMarkets;
    }
}
