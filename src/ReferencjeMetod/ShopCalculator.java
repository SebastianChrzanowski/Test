package ReferencjeMetod;

import java.util.function.BiFunction;

public class ShopCalculator {

    private final int quantity;
    private final double price;

    public ShopCalculator(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public double calculate(BiFunction<Integer,Double,Double> function){
        return function.apply(quantity,price);
    }
}
