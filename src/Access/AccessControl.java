package Access;

import Validator.Validate;

import java.util.Scanner;

public class AccessControl {
    private Scanner sc = new Scanner(System.in);

    public AccessControl() {

    }

    public void connect() {
        System.out.println("Are you user or admin ?");
        System.out.println("please enter following number");
        System.out.println("1- user");
        System.out.println("2- admin");
        System.out.println("3- Exit");
        int userId = Validate.readOnlyIntegers(sc);
        accessUser(userId).libraryOptions();
    }

    public Persone accessUser(int userId) {
        Persone persone = null;
        switch (userId) {
            case 1:
                persone = new User();
                break;
            case 2:
                persone = new Admin();
                break;
            case 3:
                System.out.println("feedback");
                break;
            default:
                System.out.println("we dont have that option");
                connect();
                break;
        }
        return persone;
    }

}
