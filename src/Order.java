/**
 * Order class
 * part of the State pattern
 */
public class Order {
    private OrderState inProcessing;
    private OrderState preparing;
    private OrderState delivered;
    private OrderState currentState;
    public OrderData data;

    public Order() {
        inProcessing = new ConcreteOrderState(this);
        preparing = new ConcreteOrderState(this);
        delivered = new ConcreteOrderState(this);
        currentState = inProcessing;
    }
    public Order (OrderData data) {
        this();
        this.data = data;
    }
    public void inProcessing() {
        currentState.inProcessing();
    }
    public void preparing() {
        currentState.preparing();
    }
    public void delivered() {
        currentState.delivered();
    }
    public OrderState getInProcessing() {
        return inProcessing;
    }
    public OrderState getPreparing() {
        return preparing;
    }
    public OrderState getDelivered() {
        return delivered;
    }
    public void setState(OrderState currentState) {
        this.currentState = currentState;
    }
}

