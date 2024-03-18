public class Waiter {
    public String name;
    public Waiter() {
    }
    public Waiter(String name) {
        this.name = name;
    }
    public Order takeOrder(OrderData orderData, Kitchen kitchen) {
        kitchen.notifyObservers("Order received");
        Order order = new Order(orderData);
        kitchen.prepareOrder(order);
        return order;
    }
}
