import java.util.Scanner;

public class Main {
    static Scanner myScanner;
    static String user;
    static String userPass;

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Please create a Username: ");
        System.out.println(user = myScanner.nextLine());
        System.out.println("Please create a Password: ");
        System.out.println(userPass = myScanner.nextLine());
        checkUsername();
        checkPassword();
    }

    public static void checkUsername() {
        Scanner myScanner = new Scanner(System.in);

        for(int i = 0; i <= 2; ++i) {
            System.out.println("Please log in with your username: ");
            String userConfirm = myScanner.nextLine();
            if (user.equals(userConfirm)) {
                return;
            }

            System.out.println("Unrecognised user");
        }

    }

    static void checkPassword() {
        Scanner myScanner = new Scanner(System.in);

        for(int i = 0; i <= 2; ++i) {
            System.out.println("Please enter your password: ");
            String userPassConfirm = myScanner.nextLine();
            if (userPass.equals(userPassConfirm)) {
                System.out.println("You are logged in. Welcome " + user + "!");
                return;
            }

            System.out.println("Incorrect password");
        }

    }

    static {
        myScanner = new Scanner(System.in);
        user = "";
        userPass = "";
    }
}