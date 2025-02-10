/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Practice Abstraction, Inheritance, Polymorphism
 * Course: IST 242
 * Author: Thomas Koltes
 * Date Developed: 2/9/2025
 * Last Date Changed: 2/9/2025
 * Rev: 1

 */

/**
 * Main class for generating Monsters and testing polymorphism
 */
public class Main {
    public static void main(String[] args) {
        //instantiate monsters
        Monster dragon = new Dragon("Bronze Dragon", 1000,100,150);
        Monster dragon2 = new Dragon("Ancient Dragon", 1500,200,300);
        Monster goblin = new Goblin("Goblin Skirmisher", 50, 25,50);
        Monster goblin2 = new Goblin("Goblin Chief",150,50,75);
        Monster zombie = new Zombie("Zombie",300,75,150);

        //print monster characteristics
        System.out.println(dragon);
        System.out.println(dragon2);
        System.out.println(goblin);
        System.out.println(goblin2);
        System.out.println(zombie);

        //print monster special powers
        dragon.specialPower();
        dragon2.specialPower();
        goblin.specialPower();
        goblin2.specialPower();
        zombie.specialPower();

    }
}
