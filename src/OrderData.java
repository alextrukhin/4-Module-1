import java.util.ArrayList;
import java.util.List;

/**
 * OrderData
 * part of the Strategy pattern
 */
public class OrderData {
    private List<Product> products = new ArrayList<>();
    private DeliveryStrategy deliveryStrategy;
    public Double total () {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
    public OrderData(List<Product> products, DeliveryStrategy deliveryStrategy) {
        this.products = products;
        this.deliveryStrategy = deliveryStrategy;
    }
    public Double getTotal() {
        double deliveryCost = deliveryStrategy.calculateDeliveryCost(this);
        return total()+deliveryCost;
    }
}
