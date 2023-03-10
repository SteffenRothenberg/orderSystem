import java.util.List;

public class Order {
    private String orderID;
    private List<Product> products;

    public Order(String orderID, List<Product> products) {
        this.orderID = orderID;
        this.products = products;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", products=" + products +
                '}';
    }
}
