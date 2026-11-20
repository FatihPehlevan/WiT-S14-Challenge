package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;


    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        setMeat("Tofu");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        setPrice(getPrice() + price);
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        setPrice(getPrice() + price);
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Name: " + getName());
        System.out.println("Meat: " + getMeat());
        System.out.println("BreadRollType: " + getBreadRollType());
        for(int i=0; i<getAdditionalIngredients().length; i++) {
            if (getAdditionalIngredients()[i] != null) System.out.println("Addition" + (i+1) + ": " + getAdditionalIngredients()[i]);
        }
        String[] healthyIngredients = {healthyExtra1Name, healthyExtra2Name};
        for(int i=0; i<healthyIngredients.length; i++) {
            if (healthyIngredients[i] != null) System.out.println("Addition" + (i+1) + ": " + healthyIngredients[i]);
        }
        System.out.println("Price: " + getPrice());

    }
}
