package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
1 1 Napisz program, który pobierze o użytkownika cztery łańcuchy znaków, które umieścisz w liście. Następnie posortuj tę listę używając metody List.sort. Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.
2 Napisz program, który wywoła funkcję equals na instancji klasy Object używając mechanizmu odwoływania się do metody (przy pomocy ::).
3 Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::).
 */
public class Zadania {

    public static void main(String[] args) {

        ArrayList<String> zadanie1 = new ArrayList<>();
        zadanie1.add("Sebastian Chrzanowski");
        zadanie1.add("Ma");
        zadanie1.add("kota");
        zadanie1.add(" kicie c");

        zadanie1.forEach(xXx -> System.out.println(xXx));

        zadanie1.sort((a, b) -> b.length() - a.length());
        System.out.println("po sortowaniu");
        zadanie1.forEach(xXx -> System.out.println(xXx));


        // Zadanie 2 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


        Supplier newSu = Object::new;
        Supplier<Object> objectCreator = Object::new; // instrukcja jak jak bedzie sie tworzyl obiekt
        // same as new Object()
        Object objectInstance = objectCreator.get(); // utworzenie nowego obiektu
        System.out.println("Supplier, ponizej isntancja");
        System.out.println(objectInstance);

        // porównanie, podajemy 2 obiekty
        BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
        // same as objectInstace.equals(new Ojbect())
        System.out.println(equalsMethodOnClass.test(objectInstance, new Object())); // w miejscu new Obcect() powinnismy przeslac jakis obiekt

        // podajemy 1 obiekt
        Predicate<Object> equalsMethodOnObject = objectInstance::equals;
        // same as objectInstace.equals(new Ojbect())
        System.out.println(equalsMethodOnObject.test(new Object()));


        //ZADANIE 3 Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::). BiFunction

        HumaFaktory nowyCzlowiek = new HumaFaktory() {
            @Override
            public Human stworzInstancje(int age, String name) {
                return new Human(age,name);
            }
        };
        // całym tym intarface zastepuje: new Human (25, imie)
        Human NowyCzlowiekZklasyHuman = nowyCzlowiek.stworzInstancje(25,"Frank");

        HumaFaktory Sebastian1 = Human::new; // Sebastian1 - na instancja interfacu fukncyjnego
       // Sebastian1.stworzInstancje(34,"sebastian");
        Human human1 = Sebastian1.stworzInstancje(34,"Sebastian"); // human1 to nazwa instancji human
        System.out.println(human1.getAge());
        System.out.println(human1.getName());


        BiFunction<Integer,String,Human> Andrzej = Human::new;
        Human human2 =Andrzej.apply(59, "Andrzej");
        human2.getAge();
        human2.getName();




    }//psvm

    public static void StworzInstancje(int age, String name) {
        new Human(age, name);
    }
}//clasa




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
