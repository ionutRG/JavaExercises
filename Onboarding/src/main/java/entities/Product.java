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


//    public static WebElement createProductsListAsString () {
//        String products =
//    }

//    Product items = new Product(getProductsItemNameList(itemName), getProductsItemDescriptionList(itemDescription), getProductsItemPriceList(itemPrice));

//    item Price returned as $10,99. Method to remove $ from price and convert price String value to int value
//    public String itemPricesWithoutDollar() {
//        String priceWithoutDollar = getProductsItemPriceList().toString(itemPrice);
//        priceWithoutDollar = priceWithoutDollar.replace("$", "");
//        System.out.println("Prices without $ sign are: " + priceWithoutDollar);
//        return priceWithoutDollar;
//    }


//    Product[] items = {
//            new Product(getProductsItemNameList()),
//            new Product()
//    }




}
