package es.serbatic.microshop.catalog.core.model;

public class Product {
    private final String type;
    private final String model;
    private String name;
    private double price;
    private int discount;

    public Product(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return type + "-" + model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getSalePrice() {
        return price * (1 - (double)discount/100);
    }
}
