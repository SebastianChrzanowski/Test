package Strumienie.Optional;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoveMain {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie A",4.7, Arrays.asList(Genre.ACTION,Genre.COMEDY), LocalDate.of(2019,10,15)),
                new Movie("Movie B",3.7, Arrays.asList(Genre.DRAMA,Genre.HORROR), LocalDate.of(2018,1,14)),
                new Movie("Movie C",2.7, Arrays.asList(Genre.HORROR,Genre.ACTION), LocalDate.of(2010,2,13)),
                new Movie("Movie D",4.3, Arrays.asList(Genre.DRAMA,Genre.DRAMA), LocalDate.of(2014,5,14)),
                new Movie("Movie E",4.2, Arrays.asList(Genre.ACTION,Genre.FANTASY), LocalDate.of(2022,2,6)),
                new Movie("Movie F",1.7, Arrays.asList(Genre.FANTASY,Genre.DRAMA), LocalDate.of(2008,7,30)),
                new Movie("Movie G",4.3, Arrays.asList(Genre.DRAMA,Genre.COMEDY), LocalDate.of(2009,8,4)),
                new Movie("Movie H",2.4, Arrays.asList(Genre.COMEDY,Genre.DRAMA), LocalDate.of(1999,3,6)),
                new Movie("Movie I",5.6, Arrays.asList(Genre.COMEDY,Genre.FANTASY), LocalDate.of(1997,1,15)),
                new Movie("Movie Aa",4.1, Arrays.asList(Genre.ACTION,Genre.COMEDY), LocalDate.of(2019,10,15)),
                new Movie("Horror Ab",4.2, Arrays.asList(Genre.ACTION,Genre.COMEDY), LocalDate.of(2019,10,15)),
                new Movie("Horror Ac",4.3, Arrays.asList(Genre.ACTION,Genre.COMEDY), LocalDate.of(2019,10,15)),
                new Movie("Movie J",1.8, Arrays.asList(Genre.HORROR,Genre.DRAMA), LocalDate.of(2015,12,11))
        );
  /*  for(Movie movie : movies){
        if(movie.getRating()>4){
            if(movie.getReleaseDate().isAfter(LocalDate.of(1999,12,30))){
                if(movie.getGenres().contains(Genre.ACTION)){
                    System.out.println(movie.getName().toUpperCase());
                }
            }
        }
    }//for */

    movies.stream()
            .filter( movie -> movie.getRating() >1)
            .filter(movie -> movie.getReleaseDate().isAfter(LocalDate.of(1999,12,30)))
            .filter(movie -> movie.getGenres().contains(Genre.ACTION))
            .sorted(Comparator.comparing(Movie::getRating))
            .limit(5)
       //     .skip(2)
            .map(movie -> movie.getName().toUpperCase())
            .forEach(System.out::println);

    long iloscwynikow = movies.stream()
                .filter( movie -> movie.getRating() >1)
                .filter(movie -> movie.getReleaseDate().isAfter(LocalDate.of(1999,12,30)))
                .filter(movie -> movie.getGenres().contains(Genre.ACTION))
                .sorted(Comparator.comparing(Movie::getRating))
                .limit(5)
                //     .skip(2)
               .map(movie -> movie.getName().toUpperCase())
                .count() ;
        System.out.println("po dodaniu count " + iloscwynikow);

//public void findFirst() {
           // movies.stream()
         //           .filter(movie -> movie.getName().startsWith("H"))
        //            .findFirst()
           //         .map(movie -> movie.getName().toUpperCase())
                  //  .map(movie-> System.out.println(movie));
           //         .forEach(System.out::println);
        //}
    }// psvm

    }//class
