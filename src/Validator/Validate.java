package Validator;

import IMDB.Genre;

import java.util.Scanner;

public class Validate {
    private Scanner sc = new Scanner(System.in);

    public static int limitationOfRating(Scanner sc) {
        boolean valid = true;
        int userNumber = 0;
        while (valid) {
            userNumber = readOnlyIntegers(sc);
            if (userNumber > 5) {
                System.out.println("the rating  is 5");
                System.out.println("please re-enter again");
                valid = true;
            } else if (userNumber <= 0) {
                System.out.println("the lowest rating is 0");
                System.out.println("please re-enter again");
                valid = true;
            } else {
                valid = false;
            }
        }
        return userNumber;
    }

    public static int limitationOfStaff(Scanner sc) {
        boolean valid = true;
        int userNumber = 0;
        while (valid) {
            userNumber = readOnlyIntegers(sc);
            if (userNumber <= 0) {
                System.out.println("the lowest staff size is 1");
                System.out.println("please re-enter again");
                valid = true;
            } else {
                valid = false;
            }
        }
        return userNumber;
    }

    public static boolean readOnlyEnumClass(Scanner sc, String str) {
        boolean enumCheck = false;
        int count = 0;
        for (Genre s : Genre.values()) {
            if (str.equals(s.toString())) {
                count++;
            }
        }
        if (count > 0) {
            enumCheck = false;
        } else {
            System.out.println("please re-enter Genre again there was an error");
            enumCheck = true;
        }
        return enumCheck;
    }

    public static int readOnlyIntegers(Scanner sc) {
        int integer = 0;
        try {
            integer = sc.nextInt();
        } catch (Exception e) {
            System.out.println("only integers are allowed");
            sc.nextLine();
            integer = readOnlyIntegers(sc);
        }
        return integer;
    }
}
