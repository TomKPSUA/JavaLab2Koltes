/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Practice Abstraction, Inheritance, Polymorphism
 * Course: IST 242
 * Author: Thomas Koltes
 * Date Developed: 2/9/2025
 * Last Date Changed: 2/9/2025
 * Rev: 1

 */
/**
 * Extending Monster class to create Zombie Final Class
 */
public final class Zombie extends Monster {
    private int biteDamage;

    public Zombie(String name, int health, int attackDamage, int biteDamage) {
        super(name, health, biteDamage);
        this.biteDamage = biteDamage;
    }
    //getters and setters
    public int getBiteDamage() {
        return biteDamage;

    }
    public void setBiteDamage(int biteDamage) {
        this.biteDamage = biteDamage;
    }
    @Override
    public void specialPower() {
        System.out.println(getName() + " bites does " + biteDamage + " damage. ");
    }
}
