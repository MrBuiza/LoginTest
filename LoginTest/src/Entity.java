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


// Spy to has an additional field called hidden which is a boolean.
// New method created which returns whether spy is hidden or not.
// Code which calculates how much health an entity has and then returns whether they are healthy.
// "healthy"(80-100 health) "unhealthy"(40-80) "need medic"(1-40)

//Add attack for all classes to allow 1 entity to attack another entity: Scout: weak attack, Medic: Medium attack, Spy: High/critical attack.
//Create an attack method which does damage to a classes health and reduces the amount of health they have based on the strength of the attack.
}
