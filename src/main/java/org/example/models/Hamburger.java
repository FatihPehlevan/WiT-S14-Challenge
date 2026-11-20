package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(){}

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;



    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.price += price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.price += price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.price += price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.price += price;
    }



    public void itemizeHamburger() {
        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);
        String[] additionalIngredients = {addition1Name, addition2Name, addition3Name, addition4Name};
        for(int i=0; i<additionalIngredients.length; i++) {
            if (additionalIngredients[i] != null) System.out.println("Addition" + (i+1) + ": " + additionalIngredients[i]);
        }
        System.out.println("Price: " + price);
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String[] getAdditionalIngredients() {
        return new String[]{addition1Name, addition2Name, addition3Name, addition4Name};
    }
}
