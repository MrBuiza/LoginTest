public class Entity {
    protected String name;
    protected int speed;
    protected int health;
    protected int stealth;
    protected int attack;

    public Entity(String name, int speed, int health, int stealth, int attack){
        this.name = name;
        this.speed = speed;
        this.health = health;
        this.stealth = stealth;
        this.attack = attack;
    }

    public static int checkHealth(int health){
        if (health >= 80) {
            System.out.println("Healthy");
        } else if (health >= 40) {
            System.out.println("Unhealthy");
        }
        else {
            System.out.println("Need medic!");
        }
        return health;

    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void loseHealth(int value){
        health = health - value;
    }
    public void attack(Entity entity){
        entity.loseHealth(this.attack);
        System.out.println(entity.getName() + " New health is " + entity.health);
    }

}
