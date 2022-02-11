package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
1 1 Napisz program, który pobierze o użytkownika cztery łańcuchy znaków, które umieścisz w liście. Następnie posortuj tę listę używając metody List.sort. Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.
2 Napisz program, który wywoła funkcję equals na instancji klasy Object używając mechanizmu odwoływania się do metody (przy pomocy ::).
3 Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::).
 */
public class Zadania_rozwiazanie_samodzielne {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ZADANIE 1");
        ArrayList<String> zadanie1 = new ArrayList<>();
        zadanie1.add("Sebastian Chrzanowski");
        zadanie1.add("Ma");
        zadanie1.add("kota");
        zadanie1.add(" kicie c");

        zadanie1.forEach(X -> System.out.println(X));

        zadanie1.sort((String o1, String o2) -> o1.length() - o2.length() );

        System.out.println("po sortowaniu: ");
        zadanie1.forEach(lala -> System.out.println(lala));
        System.out.println("---------------------------------------------------");
        Thread.sleep(2000);
        System.out.println("ZADANIE 2");


        // Zadanie 2 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //Supplier Object::new; / BiPredicate<Object, Object> / (objectInstance, new Object()))
        //2 Napisz program, który wywoła funkcję equals na instancji klasy Object używając mechanizmu odwoływania się do metody (przy pomocy ::).

        Supplier nowyObiektInterfacuFunckyjnegoSupplier = Object::new;
        nowyObiektInterfacuFunckyjnegoSupplier.get();
        Object instancjaObiektuTworzonegoPrzezLambdeAnonimowa = nowyObiektInterfacuFunckyjnegoSupplier.get();
        //Juz mam utworzony obiekt
        // Interface BiPredicate
        BiPredicate porownanieInstancjaInterfacuFunkcyjnego = Object::equals;
        porownanieInstancjaInterfacuFunkcyjnego.test(instancjaObiektuTworzonegoPrzezLambdeAnonimowa,new Object());

        //Interface Predicate
        Predicate instancjaPredicate = instancjaObiektuTworzonegoPrzezLambdeAnonimowa::equals;
        instancjaPredicate.test(new Object()); // bo porownuje do innego obiektu



         //instrukcja jak jak bedzie sie tworzyl obiekt
        // same as new Object()
      //utworzenie nowego obiektu


        // porównanie, podajemy 2 obiekty
        // w miejscu new Obcect() powinnismy przeslac jakis obiekt,



        //ZADANIE 3 Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::). BiFunction
        Thread.sleep(2000);
        System.out.println("ZADANIE 3");

        HumaFaktory humaFaktory = Human::new;
        Human seba =    humaFaktory.stworzInstancje(34, "Sebastian");
        System.out.println(seba.getName());
        System.out.println("wiek "+ seba.getAge());

        BiFunction<Integer,String,Human> michal = Human::new;
        Human michalek =    michal.apply(25,"Michal");
        System.out.println(michalek.getName());
        System.out.println("wiek "+ michalek.getAge());
        System.out.println();
        System.out.println("ZADANIE 4");
        Thread.sleep(1000);
        ArrayList<String> zadanie4 = new ArrayList<>();
        zadanie4.add("Sebastian Chrzanowski");
        zadanie4.add("Ma");
        zadanie4.add("kota");
        zadanie4.add("kicie c");
        zadanie4.add("aaaaa");
        zadanie4.add("bbbb");



        zadanie4.forEach(X -> {
            if (X.contains("a"))
            System.out.println(X +"dlugosc: " + X.length());
        });

        zadanie1.sort((String o1, String o2) -> o1.length() - o2.length() );

    }//psvm


}//clasa

/*
class Human {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}
 */




