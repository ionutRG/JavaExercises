package JAVA_Course_Exercises;

public class Clothing implements Comparable<Clothing> {
    private String description;
    private double price;
    private String size;
    public static final double MIN_PRICE = 9.99;
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

    public double getPriceWithTax() {
        return price + (price * TAX_RATE);
    }

    public double getPriceWithoutTax() {
        return price;
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

    @Override
    public String toString() {
        return getDescription() + ", " + getSize() + ", " + getPriceWithoutTax();
    }

    @Override
    public int compareTo(Clothing compare) {
        return this.description.compareTo(compare.description);
    }
}
