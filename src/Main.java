import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Client client = new Client();
        List<Product> products = new ArrayList<>();
        List<Waiter> waiters = new ArrayList<>();

        products.add(new Product("Bread", 2.99));
        products.add(new Product("Milk", 3.99));
        products.add(new Product("Eggs", 4.99));

        waiters.add(new Waiter("John"));

        kitchen.addObserver(client);
        client.cart = new Cart(products);
        client.cart.checkout();
        Order order = waiters.get(0).takeOrder(new OrderData(products, new SelfPickupStrategy()), kitchen);
    }
}