package Strumienie_zadania;

import java.util.*;
import java.util.stream.Collectors;

public class Strumienie_zadanie {

    /*
    Zadanie 1:
    robic liste stringow, wyplic liste co mają litere a
    Zadanie 2:
    Lista obiektow np. Policjan, imie, wiek, plec, stanowisko, id, Zrobic hashMape z kluczem ID dla policjanow pow 25lat, Wynik = imie plus nazwisko plus wiek

     */


    public static void main(String[] args) throws InterruptedException {

        List<String> zadanie1Lista = new ArrayList<>();

        zadanie1Lista.add("Sebastian");
        zadanie1Lista.add("Lukasz");
        zadanie1Lista.add("Krzysiek");
        zadanie1Lista.add("Michal");
        zadanie1Lista.add("Kotu");
        zadanie1Lista.add("Mateusz");
        zadanie1Lista.add("Ada");

        System.out.println("Wykonanie tradycyjny sposobem: ");
        for (String listaDosout : zadanie1Lista){
            System.out.println(listaDosout);
        }
        Thread.sleep(1000);
        System.out.println();
        System.out.println("Obrobka listy streamami : ");

        zadanie1Lista.stream()
                .map(String::toLowerCase)
                .filter(xxx -> xxx.contains("a"))
                .sorted(Comparator.comparing(String::length))
                .map(xxx->xxx.toUpperCase())
                .forEach(System.out::println);




        List<Integer> listaintidzerow = listowaniePoddlugosci(zadanie1Lista);
        listaintidzerow.stream().forEach(System.out::println);









        //Zadanie 2


        List<Policjant> psyLista = Arrays.asList(
                new Policjant("Cezary","Cezarys",32, 'm', 123451, Stopien.KRAWEŻNIK),
                new Policjant("Jarek","Naczelski",19, 'm', 123452, Stopien.DETEKTYW),
                new Policjant("Mateusz","Morawiecki",29, 'm', 123423, Stopien.GENERAL),
                new Policjant("Kazik","Maly",20, 'm', 123432, Stopien.KOMISZARZ),
                new Policjant("Janusz","Kowalski",18, 'm', 143457, Stopien.PODKOMISARZ),
                new Policjant("Seba","Mocny",25, 'm', 673457, Stopien.POSTERUNKOWY),
                new Policjant("Romuald","Borewicz",27, 'm', 154457, Stopien.PORUCZNIK),
                new Policjant("Ania","Ciasna",26, 'k', 954457, Stopien.POSTERUNKOWY),
                new Policjant("Kasia","Szeroka",27, 'k', 924457, Stopien.PORUCZNIK),
                new Policjant("Jan","Kaczmarek",38, 'm', 154437, Stopien.KRAWEŻNIK),
                new Policjant("Michale","Alkomat",25, 'm', 672157, Stopien.POSTERUNKOWY),
                new Policjant("Antos","Piwny",25, 'm', 673237, Stopien.POSTERUNKOWY)
        );

        Map<Integer, String > listaHash = hashMapaZStreama(psyLista);
        Map<Stopien, List<Policjant>> listaStopni = sortowaniePoStopniu(psyLista);

        System.out.println("wykaz id i name - ZADANIE NR 2 od Lukasza");
        for(Integer key : listaHash.keySet()) {
            String value = listaHash.get(key);
            System.out.println(key + ": " + value);
        }



        Thread.sleep(1000);
        System.out.println();
        System.out.println("Sortowanie po stopniach");
        System.out.println(listaStopni);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        listaHash.entrySet().forEach(entry -> System.out.println(entry.getValue()));

        Thread.sleep(1000);
        System.out.println();
        Thread.sleep(200);
        System.out.println();
        Thread.sleep(200);
        System.out.println();
        Thread.sleep(200);
        System.out.println("czas na mape");

        listaStopni.entrySet().forEach(entry -> {
            entry.getValue().stream()
                    .filter(plec -> plec.getPlec() != 'k')
                    .map(x-> x.getName_policjantw() + " " + x.getNazwisko() + " " + x.stopien)
                    .forEach(System.out::println);
        });


    }

    public static List<Integer> listowaniePoddlugosci  (List<String> list){
       return list.stream()
                .map(String::toLowerCase)
                .filter(xxx -> xxx.contains("a"))
                .sorted(Comparator.comparing(String::length))
                .map(xxx->xxx.toUpperCase())
                .map(xxx->xxx.length())
                .collect(Collectors.toList());
    }

    public static Map<Integer,String> hashMapaZStreama (List<Policjant> list){
        return   list.stream()
                .filter(pies -> pies.getWiek() > 24)
                .collect(Collectors.toMap(Policjant::getID, pies-> pies.name_policjantw + " " + pies.nazwisko + " " + pies.stopien + " wiek: " + pies.wiek));

    }

    public static Map<Stopien,List<Policjant>> sortowaniePoStopniu(List<Policjant> list){
        return   list.stream()
                .filter(pies -> pies.getWiek() > 20)
                .collect(Collectors.groupingBy(Policjant::getStopien));

    }
/*
    Map<City, Set<String>> namesByCity
            = people.stream().collect(
            groupingBy(Person::getCity,
                    mapping(Person::getLastName,
                            toSet())));
                            public static Map<Integer, Set<String>> hashMapaZStreama (List<Policjant> list){
        return   list.stream()
                .filter(pies -> pies.getWiek() > 24)
                .collect(Collectors.groupingBy(Policjant ::getID(),
                mapping(Policjant::getImie,
                        toSet())));
                        .map(pies->pies.imie+" "+pies.nazwisko+" "+ pies.stopien+ " wiek: "+ pies.wiek)
*/
}
