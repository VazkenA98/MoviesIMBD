package Access;

import IMDB.MovieLibrary;

import java.util.Scanner;

public class User extends Persone implements Registeration, Login {

    private String name;
    private String id;
    private String username;
    private String password;
    private Scanner sc = new Scanner(System.in);
    private MovieLibrary movies = new MovieLibrary();

    public User() {

    }

    public User(String name, String id, String username, String password) {

        super(name, id);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void userOptions() {
        System.out.println("enter your choise");
        System.out.println("1- rate movie");
        System.out.println("2- search movie by title");
        System.out.println("3- Exit");
        int userChoise = sc.nextInt();
        switch (userChoise) {
            case 1:
                //movie.rateMovie();
                movies.rateMovie();
                userOptions();
                break;
            case 2:
                movies.searchForMovieByTitle();
                userOptions();
                break;
            case 3:
                System.out.println("feedback");
                break;
            default:
                System.out.println("we don't have that option");
                userOptions();
                break;
        }

    }

    @Override
    protected void libraryOptions() {

        register();
        if (login() == true) {
            userOptions();
        }
    }

    @Override
    public void register() {
        System.out.println("please enter username");
        String uName = sc.next();
        setUsername(uName);
        System.out.println("please enter password");
        String uPassword = sc.next();
        setPassword(uPassword);

    }

    @Override
    public Boolean login() {
        boolean loged = false;
        System.out.println("please enter username for registeration");
        String uName = sc.next();
        System.out.println("please enter password registeration");
        String uPassword = sc.next();
        if (uName.equals(getUsername()) && uPassword.equals(getPassword())) {
            loged = true;
        } else {
            System.out.println("invaild password or username");
        }
        return loged;
    }
}
