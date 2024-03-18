import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Product> products = new ArrayList<>();
    public Cart() {
    }
    public Cart(List<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
    public void checkout() {
        System.out.println("Checkout complete");
    }
    public void update(String message) {
        System.out.println("Cart received update: " + message);
    }
}
