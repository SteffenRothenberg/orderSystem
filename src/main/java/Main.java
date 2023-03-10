import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("ABC123", "Pants");
        Product p2 = new Product("BCD234", "Jacket");
        Product p3 = new Product("CDE345","Shoes");

        System.out.println(p1.getProductName() + ": " + p1.productID);
        System.out.println(p2.getProductName() + ": " + p2.productID);
        System.out.println(p3.getProductName() + ": " + p3.productID);

        List <Product> myProducts = new ArrayList<>();
        myProducts.add(p1);
        myProducts.add(p2);
        myProducts.add(p3);

        ProductRepo myRepo = new ProductRepo(myProducts);
        System.out.println(myRepo);

        ProductRepo productRepo = new ProductRepo(myProducts);

        Product product = productRepo.getProductID("123");
        if (product != null){
            System.out.println("Product found : " + product.getProductName());
        } else {
            System.out.println("Product not found. ");
        }




        ArrayList<Product> pl1 = new ArrayList<>(Arrays.asList(p1,p2,p3));
        Order o1 = new Order("OrderNo.001", pl1);

        ArrayList<Product> pl2 = new ArrayList<>(Arrays.asList(p1,p2,p2));
        Order o2 = new Order("OrderNo.002", pl2);

        ArrayList <Order> myOrders = new ArrayList<>();
        myOrders.add(o1);
        myOrders.add(o2);

        OrderRepo myOrderRepo = new OrderRepo(myOrders);

        Order order = myOrderRepo.getOrderID("OrderNo.001");
        if (product != null){
            System.out.println("Order found : " + order.getOrderID());
        } else {
            System.out.println("Order not found. ");
        }

    }
}
