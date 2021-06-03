package entities;

public class Product {
    private String name;
    private String description;
    private String price;

    public Product(String itemName, String itemDescription, String itemPrice) {
        this.name = itemName;
        this.description = itemDescription;
        this.price = itemPrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
}
