package ReferencjeMetod;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceClass {


    public static void main(String[] args) {
        Function<String, Integer>  anonymous = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return null;
            }
        };



        Function<String, Integer>  lamda = s -> s.length();

        Function<String, Integer>  methodReference = String::length;

        Consumer<String> consumer1 =name -> print("labda");
        Consumer<String> consumer = MethodReferenceClass::print;
        consumer.accept("Peter");


        // ZADANIE z klasa ShopCalculator
        ShopCalculator calculator = new ShopCalculator(10,87.54);
       // calculator.calculate((quantity, price) -> quantity*price);
        // Zwykly zapis




        //Lamda
        double result = calculator.calculate((quantity, price) -> quantity*price);
        System.out.println(result);

        System.out.println();


        double result2 = calculator.calculate(MethodReferenceClass::method); // MethodReferenceClass - nazwa glowenej klasy / dane wziete z konstruktor z linijki 29
        System.out.println(result2);

    } //psvm

    public static double method(int quantity, double prize){
        double discount =0.7;
        return quantity*prize*discount;
    }


    public static void print(String name){
        System.out.println(name);


    }

    public void printClass(String name){
        System.out.println(name);
    }


    public void method(){
        Consumer<String> consumer = this::printClass;
    }


}//class
