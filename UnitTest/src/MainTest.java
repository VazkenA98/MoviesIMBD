import IMDB.Genre;
import IMDB.MovieLibrary;
import IMDB.Movies;


public class MainTest {
    private static MovieLibrary movielib = new MovieLibrary();


    public static void main(String[] args) {
        run();

    }

    public static void run() {
        testAddingNewMovieSize();
        testAddedMovieInfo();
    }

    private static void testAddingNewMovieSize() {
        movielib.addMovie();
        int size = 3;
        if (movielib.getMoviesSize() == 3) {
            System.out.println("movie was added");
        } else {
            throw new AssertionError("movie not added");
        }

    }

    private static void testAddedMovieInfo() {

        Movies newMovie = new Movies("long ranger", "based on ture stories", 4, "12/10/2019", Genre.ACTION, "jhon snow", "martin champ", "marshel ds");
        movielib.movies.add(newMovie);
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getTitle().equals(newMovie.getTitle()) : "yes";
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getDescription().equals(newMovie.getDescription()) : "yes";
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getMovieRating() == (newMovie.getMovieRating()) : "yes";
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getPremieredate().equals(newMovie.getPremieredate()) : "yes";
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getGenre().equals(newMovie.getGenre()) : "yes";
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getDirector().equals(newMovie.getDirector()) : "yes";
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getActor().equals(newMovie.getActor()) : "yes";
        assert MovieLibrary.movies.get(movielib.getMoviesSize() - 1).getWritor().equals(newMovie.getWritor()) : "yes";


    }
}
