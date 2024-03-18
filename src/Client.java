public class Client implements Observer {
    public Cart cart;
    public void update(String message) {
        System.out.println("Client received update: " + message);
    }
}
