public class ShopApp {

    public static void main(String[] args) {
//  variables definition
        double tax=1.2, total=0.0;

// customer definition
        System.out.println("Welcome to the shop!");
        Customer c1 = new Customer();
        c1.name = "Pinki";
        c1.size = "S";
        System.out.println("Customer is  "+ c1.name + " and has size: " + c1.size);
// clothing items definition
        Clothing item1 = new Clothing();
        item1.description = "Blue jacket";
        item1.price = 58.89;
        item1.size = "L";

        Clothing item2 = new Clothing();
        item2.description = "Orange T-shirt";
        item2.price = 15.25;
        item2.size = "S";

        Clothing item3 = new Clothing();
        item3.description = "Green pants";
        item3.price = 25.99;
        item3.size = "M";

        Clothing item4 = new Clothing();
        item4.description = "Black shoes";
        item4.price = 40.50;
        item4.size = "44.5";

        Clothing item5 = new Clothing();
        item5.description = "Green Scarf";
        item5.price = 7.69;
        item5.size = "S";

        Clothing item6 = new Clothing();
        item6.description = "Blue T-shirt";
        item6.price = 17.85;
        item6.size = "S";
// creation of clothing items array from existing/already previously defined Clothing items
        String[] itemsDescription = {item1.description, item2.description, item3.description, item4.description, item5.description, item6.description};
        String[] itemsSize = {item1.size, item2.size, item3.size, item4.size, item5.size, item6.size};
        double[] itemsPrice = {item1.price, item2.price, item3.price, item4.price, item5.price, item6.price};
        Clothing[] items = {item1, item2, item3, item4, item5, item6, new Clothing(), new Clothing()};

        items[6].description = "GreenScarf";
        items[6].size = "S";
        items[6].price = 13.5;

        items[7].description = "BlueT-Shirt";
        items[7].size = "XS";
        items[7].price = 18.5;

// calculation of total = item1 + 2*item2 + 20% tax
//        total = (item1.price + (2*item2.price)) * (1 + tax);
//  enhanced for loops definition
//        SE POT COMBINA MAI MULTE FOR LOOPS in acelasi for?
        System.out.println("Descriptions for Clothing items are:");
        for (String descr: itemsDescription) {
            System.out.println(descr);
        }
        System.out.println("Prices for Clothing items are:");
        for (double price: itemsPrice) {
            System.out.println(price);
        }
        System.out.println("Sizes for Clothing items are:");
        for (String sizes: itemsSize) {
            System.out.println(sizes);
        }
//  size switch based on measurement
        int measurement = 3;
//  measurement 123 = S, 456 = M, 789 = L, default = X; could NOT use case 1, 2, 3!!!
        switch (measurement) {
            case 1: case 2: case 3:
                c1.size = "S";
                break;
            case 4: case 5: case 6:
                c1.size = "M";
                break;
            case 7: case 8: case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

//        for (Clothing item: items){
//            if (item.size == "S")
//                total = total + item.price;
//        for (Clothing item: items){
//            if (item.size == "S")
//                total = total + item.price;
//            System.out.println("Item details: " + item.description + ", of size: " + item.size + " and price: " + item.price);
//        }

        for (Clothing item: items) {
            if (c1.size == item.size) {
                total = total + item.price;
                System.out.println("Item details: " + item.description + ", of size: " + item.size + " and price: " + item.price);
                if (total < 1) {break;};
            }
        }

//        for (String sizeCheck: itemsSize) {
//            measurement = measurement + 1;
//            System.out.println("Customer " + c1.name + " has the following size matches: " + measurement);
//        }

//        System.out.println("This is the 1st item description:'" +  item1.description + "' at price: " + item1.price + "$" + " and size: " + item1.size);
//        System.out.println("This is the 2nd item description:'" +  item2.description + "' at price: " + item2.price + "$" + " and size: " + item2.size);
//        System.out.println("This is the 3rd item description:'" +  item3.description + "' at price: " + item3.price + "$" + " and size: " + item3.size);
//        System.out.println("This is the 4th item description:'" +  item4.description + "' at price: " + item4.price + "$" + " and size: " + item4.size);
//        System.out.println("This is the 5th item description:'" +  item5.description + "' at price: " + item5.price + "$" + " and size: " + item5.size);
//        System.out.println("This is the 6th item description:'" +  item6.description + "' at price: " + item6.price + "$" + " and size: " + item6.size);
        System.out.println("TOTAL value of items: " + total);
        System.out.println("Number of clothing items from array: " + itemsDescription.length);
        System.out.println("Number of clothing items sizes from array: " + itemsSize.length);
        System.out.println("Number of clothing items prizes from array: " + itemsPrice.length);
    }
}
