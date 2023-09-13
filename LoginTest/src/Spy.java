public class Spy extends Entity  {

    protected static boolean hidden = true;
    protected static double random;
    public Spy(String name, int speed, int health, int stealth, int attack) {
        super(name, speed, health, stealth, attack);

    }
    public static void calculateHidden() {
        random = Math.random() * 101;
        if (random >= 50) {
            hidden = false;
        }
        else {
            hidden = true;
        }

    }

    public static boolean isHidden() {
        return hidden;
    }
}