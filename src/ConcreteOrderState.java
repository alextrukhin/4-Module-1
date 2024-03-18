public class ConcreteOrderState implements OrderState {
    private Order order;
    public ConcreteOrderState(Order order) {
        this.order = order;
    }
    public void inProcessing() {
        order.setState(order.getPreparing());
    }
    public void preparing() {
        System.out.print("preparing");
    }
    public void delivered() {
        System.out.print("delivered");
    }
}
