package app;
class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}

class XYZ {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        // Finding product with highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product with highest price: " + highestPricePid);

        // Calculate total amount spent
        double totalAmountSpent = calculateTotalAmount(products);
        System.out.println("Total amount spent: " + totalAmountSpent);
    }

    // Method to find the product with the highest price
    static int findHighestPricePid(Product[] products) {
        int highestPricePid = products[0].getPid();
        double highestPrice = products[0].getPrice();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > highestPrice) {
                highestPricePid = products[i].getPid();
                highestPrice = products[i].getPrice();
            }
        }
        return highestPricePid;
    }
    // Method to calculate total amount spent
    static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}