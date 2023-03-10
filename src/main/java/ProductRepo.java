import java.util.List;
import java.util.NoSuchElementException;

public class ProductRepo {
    private final List <Product> products;

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public Product getProductID (String productID) {
        Product result = null;
        int i = 0;
        while (result == null && i <products.size()){
            if (products.get(i).getProductID().equals(productID)) {
    result = products.get(i);
            }
            i++;
        }
        return result;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
