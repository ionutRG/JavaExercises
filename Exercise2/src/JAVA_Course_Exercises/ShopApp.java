package JAVA_Course_Exercises;

import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {
//  variables definition
        double tax = 1.2, total = 0.0;
        double averagePrice = 0;
        int counter = 0;

//  customer definition
        System.out.println("Welcome to the shop!");
        System.out.println("Minimum purchase price is: " + Clothing.MIN_PRICE + " and Tax is: " + Clothing.TAX_RATE * 100 + "%");
        Customer c1 = new Customer("Pinki_new", 9);

// clothing items definition
        Clothing item1 = new Clothing("Blue jacket", 13.55, "XL");
        Clothing item2 = new Clothing("Orange T-shirt", 7.25, "XS");
        Clothing item3 = new Clothing("Green pants", 25.99, "S");
        Clothing item4 = new Clothing("Black shoes", 40.50, "M");
        Clothing item5 = new Clothing("Green scarf", 7.77, "XL");
        Clothing item6 = new Clothing("Blue T-shirt", 17.85, "XXL");

// creation of clothing items array from existing/already previously defined Clothing items
        String[] itemsDescription = {item1.getDescription(), item2.getDescription(), item3.getDescription(), item4.getDescription(), item5.getDescription(), item6.getDescription()};
        String[] itemsSize = {item1.getSize(), item2.getSize(), item3.getSize(), item4.getSize(), item5.getSize(), item6.getSize()};
        double[] itemsPrice = {item1.getPriceWithTax(), item2.getPriceWithTax(), item3.getPriceWithTax(), item4.getPriceWithTax(), item5.getPriceWithTax(), item6.getPriceWithTax()};
        Clothing[] items = {
                item1,
                item2,
                item3,
                item4,
                item5,
                item6,
                new Clothing("Yellow hoodie", 44.99, "XXL"),
                new Clothing("Red shorts", 18.5, "XXL")
        };

//  enhanced for loops definition
        for (String descr : itemsDescription) {
            System.out.println("Descriptions for items are: " + descr);
//            break;
        }
//
//        for (double prices : itemsPrice) {
//            System.out.println("Prices for items are: " + prices);
//        }
//
//        for (String sizes : itemsSize) {
//            System.out.println("Sizes for items are: " + sizes);
//        }

        c1.addItems(items);
        System.out.println("Customer is: " + c1.getName() + " and has size: " + c1.getSize() + " with total items cost: " + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
//            System.out.println("Customer has the following item details: " + item.getDescription() + ", of size: " + item.getSize() + " and price: " + item.getPrice());
            System.out.println("Unsorted items are: " + item);
        }

        for (Clothing item : c1.getItems()) {
            System.out.println("//Am intrat in for cu: " + item.getDescription() + " si marime: " + item.getSize());
            if (item.getSize().equals("XL")) {
                System.out.println("//Am intrat in if cu: " + counter + ", cu nume: " + item.getDescription() + " cu pret: " + item.getPriceWithoutTax() + " si marime: " + item.getSize());
                counter++;
                averagePrice = averagePrice + item.getPriceWithoutTax();
            }
        }
        averagePrice = (counter == 0) ? 0 : averagePrice / counter;
//        averagePrice = averagePrice / counter;
        System.out.println("Average price is: " + averagePrice + " and number of items is: " + counter);

        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
//            System.out.println("Customer has the following item details: " + item.getDescription() + ", of size: " + item.getSize() + " and price: " + item.getPrice());
            System.out.println("Sorted items are: " + item);
        }
    }

}
