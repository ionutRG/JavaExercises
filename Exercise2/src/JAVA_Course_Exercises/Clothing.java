package JAVA_Course_Exercises;

public class Clothing {
    private String description;
    private double price;
    private String size;

    public static final double MIN_PRICE = 39.99;
    public static final double TAX_RATE = 0.2; //between (0, 1)
//    If TAX_RATE private, as below, it CANNOT be accessed from other classes
//    Clothing.TAX_RATE cannot be used from other classes if private
//    private static final double TAX_RATE = 0.2;

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
//  can use String size as parameter for Clothing constructor, but then this.size = size and not like below
        size = aSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
