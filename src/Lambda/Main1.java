package Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main1 {

    public static void main(String[] args) {


        int q = 2;

        System.out.println();


        Checker <Integer> anonimowa = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object %2 !=0;
            }
        };
        System.out.println(anonimowa.check(123));
        System.out.println(anonimowa.check(2));

       Checker <Integer> labda = xXx -> xXx %2 !=0;

        System.out.println("labda    " + anonimowa.check(123));
        System.out.println("labda   " +anonimowa.check(2));

        Function<Integer, Long> multiline = x -> {
            if (x != null && x % 2 == 0) {
                return (long) x * x/5;
            }
            else {
                return 123L;
            }
        };

        /* multiline.apply(14); */
        System.out.println( "Function 14" +   multiline.apply(2));


        Consumer <String> consumer = xXx -> {
            System.out.println("cos tam z interface consumer");
            if(xXx.equals("kurwa2")){
                System.out.println("mowisz bardzo brzydko");
            }
            else
                System.out.println("mowisz ladnie");
        };

        Predicate<Integer> sprawdzaczFlagi = xXx -> {
            if(xXx == 2)
                return true;

            else
                return false;
        };



        consumer.accept("kurwa");
        sprawdzaczFlagi.test(2);
        System.out.println(sprawdzaczFlagi.test(2));


        List<Integer> lista1 = Arrays.asList(1,2,3,4,5,67,8);
        System.out.println("_______________________");
        System.out.println("_______________________");
        System.out.println("_______________________");
        for (Integer lista2 : lista1){
            System.out.println(lista2);
        }
        System.out.println("z labda");
        lista1.forEach(xXx-> System.out.println(xXx));



    }
}
