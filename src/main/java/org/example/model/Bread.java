package org.example.model;

public class Bread extends ProductForSale{


    public Bread(String type, int price, String description) {
        super(type, price, description);

    }


    @Override
    public String showDetails() {
        return "Type: " + getType() + " Price: " + getPrice() + " Desc: " + getDescription();
    }
}
