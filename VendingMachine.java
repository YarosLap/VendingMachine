package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name, int volume);

    Product getProduct(String name, int volume, int temperature);
}




/*
public class VendingMachine {
    private List<Product> vending = new ArrayList<>();

    public VendingMachine addProduct(Product prod){
        vending.add(prod);
        return this;
    }
}
 */
