package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {


        Sum sum1 = new Sum() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };


      Sum labda1 = (a, b) -> a + b;
      Faktor faktor = a -> a*a;
        System.out.println(faktor.factor(5));





      labda1.calculate(2,3);
        System.out.println(labda1.calculate(2,5));


        System.out.println("-------------------------------");

        List<Integer> integerList = Arrays.asList(1,2,3,5,6);

        integerList.forEach(element -> System.out.println(element));

        System.out.println("------------- ARRAY LIST -------------------");
        ArrayList<Integer> integerArrayList = new  ArrayList();

        integerArrayList.add(11);
        integerArrayList.add(12);
        integerArrayList.add(13);
        integerArrayList.add(14);
        integerArrayList.add(15);
        integerArrayList.add(16);

        integerArrayList.forEach(arrayListElemetn -> System.out.println(arrayListElemetn));

        System.out.println();
        System.out.println("-----------------------------------");

        integerList.forEach(element -> {
            int x=1000;
            element +=x;
            System.out.println(element);
        });

        System.out.println("---------------------- Nothing special ------------------");

      //  NothingSpecial nothingSpecial =  TestApp :: printMassegeSeba;
        NothingSpecial nothingSpecial = TestApp::printMassegeSeba;
        nothingSpecial.nothing();


        Object objectInstance = new Object();



    }

    private static void printMassegeSeba(){
        System.out.println("Hello :0 ");
    }

}
