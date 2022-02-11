package Strumienie.Optional;

import java.time.LocalDate;
import java.util.List;

public class Movie {


    private final String name;
    private final double rating;
    private  final List<Genre> genres;
    private final LocalDate releaseDate;

    public Movie(String name, double rating, List<Genre> genres, LocalDate releaseDate) {
        this.name = name;
        this.rating = rating;
        this.genres = genres;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
