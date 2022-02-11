package SortowanieListy;

import java.util.ArrayList;
import java.util.Comparator;

public class Sortowanie {

    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();

        lista.add("Sebastian Chrzanowski");
        lista.add("Michal Chrzanowski");
        lista.add("Filip Chrzanowski");
        lista.add("Andrzej Chrzanowski");
        lista.add("Ryszard Chrzanowski");
        lista.add("a");
        lista.add("111111111111111111111111111111111111111111111111111111111111111111111111111111");

        for(String listaNazwisk : lista){
            System.out.println(listaNazwisk);
        }
        System.out.println();
        System.out.println();
        System.out.println("sortowanie");

        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return 15;
                }
                else if(o1.length() < o2.length()){
                    return -5;
                }
                else
                    return 0;
            }
        });

        for(String listaNazwisk : lista){
            System.out.println(listaNazwisk);
        }

    }

}
