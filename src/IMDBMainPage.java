import Access.AccessControl;
import IMDB.MovieLibrary;
import Validator.Validate;

import java.util.Scanner;

public class IMDBMainPage {
    private AccessControl ac = new AccessControl();
    private Scanner sc = new Scanner(System.in);
    private MovieLibrary movies = new MovieLibrary();


    public IMDBMainPage() {
        System.out.println("welcome to IMDB");
    }

    public void imdbPage() {
        switch (menu()) {
            case 1:
                getIMDBMovies();
                imdbPage();
                break;
            case 2:
                imdbAccountPage();
                imdbPage();
                break;
            case 3:
                System.out.println("good bye");
                break;
            default:
                System.out.println("we don't have that option re-enter please");
                imdbPage();
                break;
        }
    }

    private int menu() {
        System.out.println("please enter following number");
        System.out.println("1- see all movies");
        System.out.println("2- login or create acount");
        System.out.println("3- Exit page");
        int choise = Validate.readOnlyIntegers(sc);
        return choise;
    }

    private void imdbAccountPage() {
        ac.connect();
    }

    private void getIMDBMovies() {
        movies.getAllMovies();
    }
}
