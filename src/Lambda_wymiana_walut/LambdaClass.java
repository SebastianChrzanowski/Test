package Lambda_wymiana_walut;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaClass {

    public static void main(String[] args) {


// Interfacy funkcyjne $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//Nie dotyczy zadania
        Predicate<String> predicate = (name) -> name.contains("s"); // zwraca true
        predicate.test("seba");
        System.out.println("Predicate :" + predicate.test("seba"));

        Consumer<String> consumer = name -> System.out.println(name);
        consumer.accept("Lalala");


        Supplier<String> supplier =() -> "123"; // za pomoca tego tworzy sie nowe obiekty
        supplier.get();

        Supplier<Human> nowyHuman = () -> new Human();
        Human seba = nowyHuman.get();
        seba.NapiszcoszHumana();

        Function<String, Integer> function = (name) -> name.length();
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

        //Zadanie poniżej


//klasa anonimowa

        PlnCurrencyCalculator anonymous = new PlnCurrencyCalculator() {
            @Override
            public double exchangeForeingToPln(Currency currency, double amount) {
                return currency.getExchangeRatetoPln()*amount;
            }
        };

        PlnCurrencyCalculator lambdaZklamramiDlaWieluMetod = (currency, amount) -> {
            System.out.println("czesc");
            return currency.getExchangeRatetoPln()*amount;
        };


        // currency - jest to obiekt enuma
        PlnCurrencyCalculator lambda = (currency, amount) -> currency.getExchangeRatetoPln() *amount;






        double result = method(
                (currency -> currency.equals(Currency.GBP)),
                (((currency, amount) -> currency.getExchangeRatetoPln()*amount)),
                Currency.GBP
        );
        System.out.println(result);
    } // psvm

    public static double method(Predicate<Currency> predicate,PlnCurrencyCalculator plnCurrencyCalculator, Currency currency){
        if (predicate.test(currency)){
            return plnCurrencyCalculator.exchangeForeingToPln(currency,100);
        }else {
            throw new RuntimeException("blad");
        }

    } //public static double method
} // LambdaClass
