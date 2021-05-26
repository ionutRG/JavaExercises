package JAVA_Course_Exercises;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;
    private int measurement;
    

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : items) {
            System.out.println("//Am intrat in for cu item: " + item.getDescription() + " size: " + item.getSize());
//            if (c1.getSize().equals(item.getSize())) {
            System.out.println("//Am gasit item de acceasi marime: " + item.getSize() + item.getDescription() + " cu pret: " + item.getPrice());
            total = total + item.getPrice();
//                total = total + total * tax;
            System.out.println("Total: " + total);

//            if (total > 30) {
//                System.out.println("//Totalul este mai mare decat 30");
//                System.out.println("Item details: " + item.getDescription() + ", of size: " + item.getSize() + " and price: " + item.getPrice());
//                break;
//            }
//            }
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public void setSize(int measurement) {
//  measurement 123 = S, 456 = M, 789 = L, default = X; could NOT use case 1, 2, 3!!!
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
}
