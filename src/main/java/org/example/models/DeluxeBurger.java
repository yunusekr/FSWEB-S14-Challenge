package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;
    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.1, "Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void itemizeHamburger() {
        System.out.println(getName());
        System.out.println(getMeat());
        System.out.println(getBreadRollType());
        System.out.println(getPrice());
    }
}