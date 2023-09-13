public class Main {
   /* static Scanner myScanner;
    static String user;
    static String userPass;
*/
    public static void main(String[] args) {
    /*    System.out.println("Please create a Username: ");
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

    static {
        myScanner = new Scanner(System.in);
        user = "";
        userPass = "";
    }
    */
        Scout scout = new Scout("Scout", 150, 95, 90, 20);
        Medic medic = new Medic("Medic", 90, 150, 75, 25);
        Spy spy = new Spy("Spy", 100, 80, 150, 40);

        System.out.println("Three classes available: " + scout.getName() + " " + medic.getName() + " " + spy.getName());

        scout.attack(spy);
        medic.attack(scout);
        spy.attack(medic);
        spy.attack(scout);

        System.out.println("Scout's health is " + Entity.checkHealth(scout.getHealth()));
        System.out.println("Medic's health is " + Entity.checkHealth(medic.getHealth()));
        System.out.println("Spy's health is " + Entity.checkHealth(spy.getHealth()));

        Spy.calculateHidden();
        System.out.println("The Spy is hidden? " + Spy.isHidden());
    }

}