import java.util.List;

public class OrderRepo {

    private List<Order> orders;
    public OrderRepo(List<Order> orders){
        this.orders = orders;
    }
    public Order getOrderID(String orderID){
        Order result = null;
        int i = 0;
        while (result == null && i <orders.size()){
            if (orders.get(i).getOrderID().equals(orderID)){
                result=orders.get(i);
            } i++;
        }
        return result;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }
}
