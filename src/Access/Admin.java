package Access;

import IMDB.MovieLibrary;

import java.util.Scanner;

public class Admin extends Persone implements Login {
    private String username;
    private String password;
    private Scanner sc = new Scanner(System.in);
    private MovieLibrary movie;

    public Admin() {

    }

    public Admin(String name, String id, String username, String password) {
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

    private Boolean addAgain() {
        boolean addAgain = true;
        System.out.println("wanna add other one ?");
        System.out.println("enter yes if so");
        String check = sc.next();
        if (check.equals("yes")) {
            addAgain = true;
        } else {
            addAgain = false;
        }

        return addAgain;
    }

    @Override
    protected void libraryOptions() {

        if (login() == true) {
            do {
                movie = new MovieLibrary();
                System.out.println("adding new movie");
                movie.addMovie();
                System.out.println();
            } while (addAgain());

        }

    }

    @Override
    public Boolean login() {
        boolean loged = false;
        System.out.println("please enter admin username");
        String uName = sc.next();
        System.out.println("please enter admin password");
        String uPassword = sc.next();
        if (uName.equals("admin") && uPassword.equals("12345678")) {
            loged = true;
        } else {
            System.out.println("invaild password or username");
        }
        return loged;
    }
}
