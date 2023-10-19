package VendingMachine;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> hotDrinks;
    List<NaslednikHot> NaslednikHot;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> gethotDrinks() {
        return hotDrinks;
    }

    public List<HotDrink> NaslednikHot() {
        return hotDrinks;
    }

    public void sethotDrinks(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }


    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }


    public Product getProduct(String name, double volume){
        for (HotDrink bottle : hotDrinks) {
            if(bottle.getName().equals(name) && bottle.getVolume() == volume)
                return bottle;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }
}
