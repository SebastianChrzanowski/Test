package Strumienie.Optional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;


/*
filter – zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true,
map – każdy z elementów może zostać zmieniony do innego typu, nowy obiekt zawarty jest w nowym strumieniu,
peek – pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementami,
limit – zwraca strumień ograniczony do zadanej liczby elementów, pozostałe są ignorowane.

Kończenie strumienia
Operacjami kończącymi są wszystkie, które zwracają typ inny niż Stream. Metody tego typu mogą także nie zwracać żadnych wartości.

forEach – wykonuje zadaną operację dla każdego elementu,
count – zwraca liczbę elementów w strumieniu,
allMatch – zwraca flagę informującą czy wszystkie elementy spełniają warunek. Przestaje sprawdzać na pierwszym elemencie, który tego warunku nie spełnia,
collect – pozwala na utworzenie nowego typu na podstawie elementów strumienia. Przy pomocy tej metody można na przykład utworzyć listę. Klasa Collectors zawiera sporo gotowych implementacji.
 */
public class MainSamouczek {
    public static void main(String[] args) throws InterruptedException {

        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );
        System.out.println("praca domowa");
        System.out.println();
        double highestRanking = 0;
        BoardGame bestGame = null;
        for (BoardGame game : games) {
            if (game.name.contains("a")) {
                if (game.rating > highestRanking) {
                    highestRanking = game.rating;
                    bestGame = game;
                }
            }
        }
        System.out.println(bestGame.name);




        System.out.println();
Thread.sleep(2000);
        System.out.println();

        System.out.println("rozwiazanie z maxem");
        wybierzNajlepszą(games,highestRanking);
        BoardGame gra1 = wybierzNajlepsząMAX(games,highestRanking);
        System.out.println(gra1.name);

    //    Thread.sleep(5000);

        System.out.println("koniec pracy domowej");
        System.out.println();
        for (BoardGame game : games) {
            if (game.maxPlayers > 4) {
                if (game.rating > 8) {
                    if (new BigDecimal(150).compareTo(game.price) > 0) {
                        System.out.println(game.name.toUpperCase());
                    }
                }
            }
        }

        Stream<BoardGame> gamesStream = games.stream(); // tak tworzony jest obiekt
        games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0) // new BigDecimal(150).compareTo(g.price) > 0 porównuje ze sobą 2 obiekty , o wartosci 150. wynik "+" daje true
                .map(g -> g.name.toUpperCase())
                .forEach(System.out::println);
 // CZASEM WYCHODZI 11, CZASEM 12 // przyklad ponizszy jest z bledem!
        for (int i = 0; i < 3; i++) {
            Stream<Integer> numbers = Stream.of(1, 2, 3, 1, 2, 3, 1, 2, 3);
            StatefullOperation requriements = new StatefullOperation();
            int sum = numbers.parallel()
                    .map(requriements::modify)
                    .mapToInt(n -> n.intValue()).sum();
            System.out.println(sum);

            DoubleStream randomDoubles = new Random().doubles();
        }


        int slowNumber = IntStream.range(1950, 2150)
                .map(MainSamouczek::timeConsumingTransformation)
                .filter(n -> n == 2000)
                .sum();


    } // psvm

    public static void wybierzNajlepszą (List<BoardGame> games, double highestRanking){
        games.stream()
      //          .filter(x->x.rating>highestRanking)
                .filter(x->x.name.contains("a"))
                .sorted(Comparator.comparing(BoardGame::getRating).reversed())
                .limit(1)
                .forEach(x-> System.out.println(x.name));
    }

    public static BoardGame wybierzNajlepsząMAX (List<BoardGame> games, double highestRanking){
            return    games.stream()
                //          .filter(x->x.rating>highestRanking)
                .filter(x->x.name.contains("a"))
                .max(Comparator.comparingDouble(x->x.rating))
                .get();
    }






    public static int timeConsumingTransformation(int number) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number;
    }








}

class StatefullOperation {

    private final Set<Integer> seen = new HashSet<>();

    int modify(int number) {
        if (seen.contains(number)) {
            return number;
        }
        seen.add(number);
        return 0;
    }
}