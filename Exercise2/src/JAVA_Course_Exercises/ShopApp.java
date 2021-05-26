package JAVA_Course_Exercises;

public class ShopApp {

    public static void main(String[] args) {
//  variables definition
        double tax = 1.2, total = 0.0;
        double averagePrice = 0;
        int count = 0;

// customer definition
        System.out.println("Welcome to the shop!");
        System.out.println("Minimum purchase price is: " + Clothing.MIN_PRICE + " and Tax is: " + Clothing.TAX_RATE * 100 + "%");
        Customer c1 = new Customer("Pinki_new", 3);
//        c1.setName("Pinki");
//        c1.setSize("S");

// clothing items definition
        Clothing item1 = new Clothing("Blue jacket", 13.55, "XL");
//        item1.setDescription();
//        item1.setPrice();
//        item1.setSize();

        Clothing item2 = new Clothing("Orange T-shirt", 7.25, "XS");
        Clothing item3 = new Clothing("Green pants", 25.99, "S");
        Clothing item4 = new Clothing("Black shoes", 40.50, "44.5");
        Clothing item5 = new Clothing("Green scarf", 7.69, "S");
        Clothing item6 = new Clothing("Blue T-shirt", 17.85, "S");

// creation of clothing items array from existing/already previously defined Clothing items
        String[] itemsDescription = {item1.getDescription(), item2.getDescription(), item3.getDescription(), item4.getDescription(), item5.getDescription(), item6.getDescription()};
        String[] itemsSize = {item1.getSize(), item2.getSize(), item3.getSize(), item4.getSize(), item5.getSize(), item6.getSize()};
        double[] itemsPrice = {item1.getPrice(), item2.getPrice(), item3.getPrice(), item4.getPrice(), item5.getPrice(), item6.getPrice()};
        Clothing[] items = {
                item1,
                item2,
                item3,
                item4,
                item5,
                item6,
                new Clothing("Yellow hoodie", 44.99, "S"),
                new Clothing("Red shorts", 18.5, "XL")
        };

//  enhanced for loops definition
        System.out.println("Descriptions for items are: ");
        for (String descr : itemsDescription) {
            System.out.println(descr);
        }
        System.out.println("Prices for items are: ");
        for (double price : itemsPrice) {
            System.out.println(price);
        }
        System.out.println("Sizes for items are: ");
        for (String sizes : itemsSize) {
            System.out.println(sizes);
        }
        int measurement = 8;
        c1.addItems(items);
        System.out.println("Customer is  " + c1.getName() + " and has size: " + c1.getSize() + " with total items cost: " + c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {
            System.out.println("Item details: " + item.getDescription() + ", of size: " + item.getSize() + " and price: " + item.getPrice());
        }

        for (Clothing item : c1.getItems()) {
            count++;
            averagePrice += item.getPrice();
        }

        averagePrice = averagePrice / count;
        System.out.println("Average price is: " + averagePrice + " and number of items is: " + count);
    }

}
