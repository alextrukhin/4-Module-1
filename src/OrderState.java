public interface OrderState {
    void inProcessing();
    void preparing();
    void delivered();
}
