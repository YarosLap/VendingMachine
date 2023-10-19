package VendingMachine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWater b1 = new BottleOfWater("1", 1, 1);
        BottleOfWater b2 = new BottleOfWater("2", 2, 2);
        BottleOfWater b3 = new BottleOfWater("5", 4, 3);
        BottleOfWater b4 = new BottleOfWater("15", 123, 1);
        BottleOfWater b5 = new BottleOfWater("20", 6, 5);
        HotDrink h1 = new HotDrink("Tea", 20, 4, 60);
        HotDrink h2 = new HotDrink("Coffee", 50, 2, 40);
        HotDrink h3 = new HotDrink("Cacao", 40, 3, 50);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);

        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine(new ArrayList<>());
        vendingMachine2.addHotDrink(h1);
        vendingMachine2.addHotDrink(h2);
        vendingMachine2.addHotDrink(h3);

        System.out.println(vendingMachine.getProduct("20"));
        System.out.println(vendingMachine.getProduct("20", 100));
        System.out.println(vendingMachine2.getProduct("Coffee"));
        System.out.println(vendingMachine2.getProduct("Cacao"));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWaters()) {
//            System.out.println(b);
//        }
    }

}
