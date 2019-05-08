package IMDB;

import Validator.Validate;

import java.util.ArrayList;

import java.util.Scanner;

public class MovieLibrary {
    private final static Movies movie1 = new Movies("long ranger", "based on ture stories", 4, "12/10/2019", Genre.ACTION, "jhon snow", "martin champ", "marshel ds");
    private final static Movies movie2 = new Movies("pirates", "fighting for glory", 3, "02/10/2019", Genre.COMEDY, "jack,sparrow,akhtabut", "jony,kuku", "marshel,ds");
    public static Movies newMovie;
    public static ArrayList<Movies> movies = new ArrayList<Movies>();
    ;
    private Scanner sc = new Scanner(System.in);

    static {
        movies.add(movie1);
        movies.add(movie2);

    }

    public MovieLibrary() {

    }
    public int getMoviesSize(){
        return movies.size();
    }


    public void getAllMovies() {
        for (Object obj : movies)
            System.out.println(obj);
    }

    public void searchForMovieByTitle() {
        System.out.println("please enter your movie Title");
        String movieTitle = sc.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movieTitle.equals(movies.get(i).getTitle())) {
                System.out.println(movies.get(i));
            }
        }
    }

    public void rateMovie() {
        System.out.println("please enter your movie title to rate");
        String movieTitle = sc.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (movieTitle.equals(movies.get(i).getTitle())) {
                System.out.println("current movie rating is ->" + movies.get(i).getMovieRating());
                System.out.println("please enter rating");
                int movieRating = Validate.limitationOfRating(sc);
                movies.get(i).setMovieRating(movieRating);
            }
        }
        for (int i = 0; i < movies.size(); i++) {
            if (movieTitle.equals(movies.get(i).getTitle())) {
                System.out.println("movie rating after your rate is ->" + movies.get(i).getMovieRating());
                System.out.println(movies.get(i));
            }
        }

    }

    private void addMovieTitle() {
        newMovie = new Movies();
        System.out.println("enter movie title");
        String movieTitle = sc.next();
        newMovie.setTitle(movieTitle);
    }

    private void addMovieDiscription() {
        System.out.println("enter movie discription");
        String movieDiscription = sc.next();
        newMovie.setDescription(movieDiscription);
    }

    private void addMovieRating() {
        System.out.println("enter movie rating");
        int movieRating = Validate.limitationOfRating(sc);
        newMovie.setMovieRating(movieRating);
    }

    private void addMoviePrimerDate() {
        System.out.println("enter movie primer");
        String moviePrimer = sc.next();
        newMovie.setPremieredate(moviePrimer);
    }

    private void movieGenres() {
        System.out.println("type on of these");
        System.out.print("[");
        for (Genre s : Genre.values()) {
            System.out.print(s + ", ");
        }
        System.out.print("]");

    }

    private void addMovieGenre() {
        System.out.println("enter movie genre");
        movieGenres();
        String genre = "";
        do {
            String movieGenre = sc.next();
            genre = movieGenre.toUpperCase();
        } while (Validate.readOnlyEnumClass(sc, genre));
        newMovie.setGenre(Genre.valueOf(genre));
    }

    private void addMovieDirectors() {
        System.out.println("please enter how many directors to add");
        int directorsCount = Validate.limitationOfStaff(sc);
        for (int i = 0; i < directorsCount; i++) {
            System.out.println("enter directors name");
            String directorsName = sc.next();
            newMovie.setDirector(directorsName);
        }
    }

    private void addMovieActors() {
        System.out.println("please enter how many actors to add");
        int actorsCount = Validate.limitationOfStaff(sc);
        for (int i = 0; i < actorsCount; i++) {
            System.out.println("enter actors name");
            String actorsName = sc.next();
            newMovie.setActor(actorsName);
        }
    }

    private void addMovieWritors() {
        System.out.println("please enter how many writors to add");
        int writorsCount = Validate.limitationOfStaff(sc);
        for (int i = 0; i < writorsCount; i++) {
            System.out.println("enter writors name");
            String writorsrsName = sc.next();
            newMovie.setWritor(writorsrsName);
        }
    }

    public void addMovie() {
        addMovieTitle();
        addMovieDiscription();
        addMovieRating();
        addMoviePrimerDate();
        addMovieGenre();
        addMovieDirectors();
        addMovieActors();
        addMovieWritors();
        movies.add(newMovie);
        System.out.println(movies.size());
        System.out.println("new movie added");
        System.out.println(newMovie);

    }

}

