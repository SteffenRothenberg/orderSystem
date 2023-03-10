import java.awt.color.ProfileDataException;
import java.util.ArrayList;
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

    }
}
