package Task1;

public class Task1Main {
    public static void main(String[] args) {

        Person person1 = new Person("Kleo", 28);
        Person person2 = new Person("John Wick", 53);


        System.out.println("My name is " + person1.getName() + " and I am " + person1.getAge() + " years old.");
        System.out.println("My name is " + person2.getName() + " and I am " + person2.getAge() + " years old.");

    }
}
    /*  Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class,
        set their attributes using the constructor, and print their name and age.
        */
